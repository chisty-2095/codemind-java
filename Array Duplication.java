import java.util.Arrays;
public class ArrayDuplication {
    public static void main(String[] args) {
        int[] arr = {-1, 4, 3, 2, 7, -17};
        // Creating a new copy of array
        int[] brr = arr.clone();
        Arrays.sort(arr); // Only sorts arr,brr stays the same
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }
}
