import java.util.*;

public class Q15 {
    public static void main(String[] args) {

        int arr[] = {5,4,3,2,1};

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}