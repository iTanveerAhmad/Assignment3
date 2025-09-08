import org.junit.Test;

import static org.junit.Assert.*;

public class RecursionTests {

    @Test
    public void testFindMinChar() {
        assertEquals('a', MinCharFinder.findMinChar("akel"));
        assertEquals('b', MinCharFinder.findMinChar("bbbbbb"));
        assertThrows(IllegalArgumentException.class, () -> MinCharFinder.findMinChar(""));
    }

    @Test
    public void testPalindromeChecker() {
        assertTrue(PalindromeChecker.isPalindrome(121));
        assertFalse(PalindromeChecker.isPalindrome(102));
        assertFalse(PalindromeChecker.isPalindrome(-121));
    }

}
