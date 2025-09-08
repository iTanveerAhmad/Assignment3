import java.util.Arrays;

public class ArrayReverser {

    public static void reverse(int[] arr) {
        if (arr == null || arr.length == 0) return;
        reverseRec(arr, 0, arr.length - 1);
    }

    private static void reverseRec(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseRec(arr, left + 1, right - 1);
    }

    // for quick test
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 13};
        System.out.println("Before Reverse: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("After Reverse: " + Arrays.toString(arr));
    }
}
