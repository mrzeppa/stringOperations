import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringOperationsTest {
    StringOperations so = new StringOperations();

    @Test
    void reverseTest() {
        assertEquals("dsa", so.reverse("asd"));
    }

    @Test
    void reverseTestWithNullString() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            assertEquals(null, so.reverse(null));
        });
    }

    @Test
    void reverseTestWithEmptyString() {
        assertEquals("", so.reverse(""));
    }

    @Test
    void reverseTestWithSpecialCharacters() {
        assertEquals("?.,)(", so.reverse("(),.?"));
    }

    @Test
    void reverseTestWithIntValue() {
        assertEquals("123", so.reverse(Integer.toString(321)));
    }

    @Test
    void concatTest() {
        String s1 = "aaa";
        String s2 = "bbb";
        assertEquals("aaabbb", so.concat(s1, s2));
    }

    @Test
    void concatTestWithNullStrings() {
        String s1 = null;
        String s2 = null;
        assertEquals(null, so.concat(s1, s2));
    }

    @Test
    void concatWithFirstNullString() {
        String s1 = null;
        String s2 = "aaa";
        assertEquals(null, so.concat(s1, s2));
    }

    @Test
    void concatWithSecondNullString() {
        String s2 = null;
        String s1 = "aaa";
        assertEquals(null, so.concat(s2, s1));
    }

    @Test
    void concatTestWithFirstEmptyString() {
        String s1 = "";
        String s2 = "a";
        assertEquals(null, so.concat(s1, s2));
    }

    @Test
    void concatTestWithSecondEmptyString() {
        String s1 = "";
        String s2 = "a";
        assertEquals("a", so.concat(s2, s1));
    }

    @Test
    void palindromeTest() {
        assertTrue(so.isPalindrome("kajak"));
    }

    @Test
    void palindromeTestEmptyString() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            assertTrue(so.isPalindrome(""));
        });
    }

    @Test
    void palindromeTestWithNullString() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            assertTrue(so.isPalindrome(null));
        });
    }

    @Test
    void palindromeTestWithOneLetter() {
        assertTrue(so.isPalindrome("a"));
    }

    @Test
    void notPalindromeTest() {
        assertFalse(so.isPalindrome("ab"));
    }

    @Test
    void palindromeTestWithSpecialCharacters() {
        assertTrue(so.isPalindrome(").)"));
    }

    @Test
    void notPalindromeTestWithSpecialCharacters() {
        assertFalse(so.isPalindrome(").("));
    }



}