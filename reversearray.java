import java.util.Arrays;

public class reversearray {

    public static void reverse(int[] arr) {
        int len = arr.length - 1;

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len];
            arr[len] = temp;
            len--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        reverse(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}