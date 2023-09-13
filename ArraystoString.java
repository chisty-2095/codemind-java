import java.util.*;
public class vsa {
    public static void main(String[] args) {
        // Variable - Sized Arrays
        int[][] arr = new int[3][]; // valid
        arr[0] = new int[5];
        arr[1] = new int[2];
        arr[2] = new int[4];
        for(int i = 0; i < 3; i++)
        System.out.println(Arrays.toString(arr[i]));
    }
}
