package network;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestDatabase {
	public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
        java.sql.Statement stat =  conn.createStatement();
        ((java.sql.Statement) stat).executeUpdate("drop table if exists people;");
        ((java.sql.Statement) stat).executeUpdate("create table people (name, occupation);");
        PreparedStatement prep = conn.prepareStatement(
            "insert into people values (?, ?);");

        prep.setString(1, "Gandhi");
        prep.setString(2, "politics");
        prep.addBatch();
        prep.setString(1, "Turing");
        prep.setString(2, "computers");
        prep.addBatch();
        prep.setString(1, "Wittgenstein");
        prep.setString(2, "smartypants");
        prep.addBatch();

        conn.setAutoCommit(false);
        prep.executeBatch();
        conn.setAutoCommit(true);

        ResultSet rs = ((java.sql.Statement) stat).executeQuery("select * from people;");
        while (rs.next()) {
            System.out.println("name = " + rs.getString("name"));
            System.out.println("job = " + rs.getString("occupation"));
        }
        rs.close();
        conn.close();
    }
}
