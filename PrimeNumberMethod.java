/*
 * Class: CMSC201
 * Instructor:Grigoriy Grinberg
 * Description: Prime number utility method isPrime.
 * Due: 12/015/2025
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Farhan Rabbani
 */

/**
 * Provides a method to determine whether an integer is prime.
 */
public class PrimeNumberMethod {

    /**
     * Returns true if n is a prime number; otherwise returns false.
     *
     * @param n the number to test
     * @return true if n is prime; false otherwise
     */
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int d = 3; d * d <= n; d += 2) {
            if (n % d == 0) return false;
        }
        return true;
    }
}
