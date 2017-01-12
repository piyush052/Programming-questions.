package week1;
import java.util.*;

public class GCD {
  private static int gcd_naive(int p, int q) {
//    int current_gcd = 1;
//    for(int d = 2; d <= a && d <= b; ++d) {
//      if (a % d == 0 && b % d == 0) {
//        if (d > current_gcd) {
//          current_gcd = d;
//        }
//      }
//    }

//    return current_gcd;
	  
	  
      if (p % q == 0)

          return q;

      return gcd_naive(q, p % q);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd_naive(a, b));
  }
}
