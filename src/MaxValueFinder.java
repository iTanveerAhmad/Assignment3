public class MaxValueFinder {

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        return findMaxRec(arr, 0, arr[0]);
    }

    private static int findMaxRec(int[] arr, int index, int currentMax) {
        if (index == arr.length) {
            return currentMax;
        }
        if (arr[index] > currentMax) {
            currentMax = arr[index];
        }
        return findMaxRec(arr, index + 1, currentMax);
    }

    public static void main(String[] args) {
        int[] arr = {5, -3, 6, 1, 9, 4};
        System.out.println("Max = " + findMax(arr));
    }

}
