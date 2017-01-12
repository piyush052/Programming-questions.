package week1;

import java.math.BigInteger;
import java.util.*;

public class LCM {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    BigInteger a = scanner.nextBigInteger();
    BigInteger b = scanner.nextBigInteger();
    BigInteger g=a.gcd(b);
    BigInteger l=(a.multiply(b)).divide(g);
    

    System.out.println(""+l);
  }
}
