public class PalindromeChecker {

    public static boolean isPalindrome(int n) {
        if (n < 0) return false; // negatives not palindrome
        return n == reverseRec(n, 0);
    }

    // Helper recursive method to reverse number
    private static int reverseRec(int n, int rev) {
        if (n == 0) return rev;
        return reverseRec(n / 10, rev * 10 + (n % 10));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));  // true
        System.out.println(isPalindrome(-121)); // false
        System.out.println(isPalindrome(102));  // false
    }

}
