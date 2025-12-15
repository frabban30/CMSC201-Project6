/*
 * Class: CMSC201
 * Instructor:Grigoriy Grinberg
 * Description: JUnit tests for String methods (length, charAt, substring, indexOf).
 * Due: 12/15/2025
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Farhan Rabbani
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * This class tests selected methods of the String class using JUnit 5.
 */
public class StringTest {

    @Test
    void testLength() {
        assertEquals(0, "".length());
        assertEquals(4, "Java".length());
        assertEquals(11, "Hello World".length());
    }

    @Test
    void testCharAt() {
        String s = "Java";
        assertEquals('J', s.charAt(0));
        assertEquals('a', s.charAt(1));
        assertEquals('v', s.charAt(2));
        assertEquals('a', s.charAt(3));
    }

    @Test
    void testSubstring() {
        String s = "Computer";
        assertEquals("puter", s.substring(3));
        assertEquals("Comp", s.substring(0, 4));
    }

    @Test
    void testIndexOf() {
        String s = "banana";
        assertEquals(1, s.indexOf("a"));
        assertEquals(2, s.indexOf("na"));
        assertEquals(-1, s.indexOf("z"));
    }
}
