/*
 * Class: CMSC201
 * Instructor:Grigoriy Grinberg
 * Description: JUnit tests for PrimeNumberMethod.isPrime(int).
 * Due: 12/15/2025
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Farhan Rabbani
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Tests {@link PrimeNumberMethod#isPrime(int)} using JUnit 5.
 */
public class PrimeNumberMethodTest {

    /**
     * Tests values less than 2 (not prime).
     */
    @Test
    void testLessThanTwo() {
        assertFalse(PrimeNumberMethod.isPrime(-10));
        assertFalse(PrimeNumberMethod.isPrime(-1));
        assertFalse(PrimeNumberMethod.isPrime(0));
        assertFalse(PrimeNumberMethod.isPrime(1));
    }

    /**
     * Tests small prime numbers.
     */
    @Test
    void testSmallPrimes() {
        assertTrue(PrimeNumberMethod.isPrime(2));
        assertTrue(PrimeNumberMethod.isPrime(3));
        assertTrue(PrimeNumberMethod.isPrime(5));
        assertTrue(PrimeNumberMethod.isPrime(7));
        assertTrue(PrimeNumberMethod.isPrime(11));
        assertTrue(PrimeNumberMethod.isPrime(13));
    }

    /**
     * Tests small composite numbers.
     */
    @Test
    void testSmallComposites() {
        assertFalse(PrimeNumberMethod.isPrime(4));
        assertFalse(PrimeNumberMethod.isPrime(6));
        assertFalse(PrimeNumberMethod.isPrime(8));
        assertFalse(PrimeNumberMethod.isPrime(9));
        assertFalse(PrimeNumberMethod.isPrime(10));
        assertFalse(PrimeNumberMethod.isPrime(12));
    }

    /**
     * Tests larger numbers (mix of primes and composites).
     */
    @Test
    void testLargerNumbers() {
        assertTrue(PrimeNumberMethod.isPrime(97));
        assertTrue(PrimeNumberMethod.isPrime(101));
        assertFalse(PrimeNumberMethod.isPrime(100));
        assertFalse(PrimeNumberMethod.isPrime(121)); // 11*11
        assertFalse(PrimeNumberMethod.isPrime(143)); // 11*13
    }
}
