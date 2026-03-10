/*
9. Binary Search: 
Implement a binary search algorithm to find a target value in a sorted array. 
Input: Array: [1, 2, 3, 4, 5, 6, 7, 8, 9], Target: 4 
Output: 3 
Explanation: The function returns the index of the target value in the array.
 */

import java.util.Scanner;
import java.util.Arrays;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] ar = new int[len];
        for(int i = 0; i<len; i++){
            System.out.printf("Enter the %d element of the array: ", i+1);
            ar[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(ar);
        System.out.println("Array: " + Arrays.toString(ar));
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        int st =0, end = len-1;
        while(st<= end){
            int mid = st +(end-st)/2;
            if(ar[mid] == target){
                System.out.println(mid);
                return;
            }else if( ar[mid]> target){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        System.out.println("Target element not found.");
        
    }
}
