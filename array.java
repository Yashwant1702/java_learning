
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] arr = {1, 2, 3, 4, 5};

        // Accessing array elements
        System.out.println("First element : " + Arrays.toString(arr));
        System.out.println("Second element : " + arr.length);

        Arrays.sort(arr);
        System.out.println("Sorted array : " + Arrays.toString(arr));

        Arrays.fill(arr, 0, arr.length, 10);
        System.out.println("Filled array : " + Arrays.toString(arr));
    }
}