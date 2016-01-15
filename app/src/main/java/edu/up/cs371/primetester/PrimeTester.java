package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n) {
        long temp;
        int boo = 1;
        if (n == 2) {
            return true;
        }
        if(n<2)
        {
            return false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                temp = n % i;
                if (temp == 0) {
                    boo = 0;
                    break;
                }

            }
            if (boo == 0) {
                return false;
            } else {
                return true;
            }
        }
    }
}
