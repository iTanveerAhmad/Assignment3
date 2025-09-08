public class MinCharFinder {

    public static void main(String[] args) {
        String input = "akel";
        char minChar = MinCharFinder.findMinChar(input);
        System.out.println("Minimum character in \"" + input + "\" is: " + minChar);
    }

    // Public utility method
    public static char findMinChar(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }
        return findMinCharRec(s, 0, s.charAt(0));
    }

    // Private recursive method
    private static char findMinCharRec(String s, int index, char currentMin) {
        if (index == s.length()) {
            return currentMin;
        }
        char ch = s.charAt(index);
        if (ch < currentMin) {
            currentMin = ch;
        }
        return findMinCharRec(s, index + 1, currentMin);
    }

}
