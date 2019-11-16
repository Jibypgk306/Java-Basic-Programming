package hackerthon;
import java.util.*;
public class Prime {

	public static void main(String[] args) {

	        for (int i = 2; i < 100; i++) {

	            if (twinprime(i) && twinprime(i - 2)) {
	                System.out.printf("(%d, %d)\n", i, i - 2);
	            }
	        }
	    }
	    public static boolean twinprime(long n) {
	        for (int i = 2; i <= n / 2; i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }

	}
