/*
12. Largest and Smallest in Array 
Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event 
that either of them doesn’t exist. 
Example 1: 
Input: [1,2,4,7,7,5] 
Output: Second Smallest : 2 
Second Largest : 5 
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second 
smallest is 2 
Example 2: 
Input: [1] 
Output: Second Smallest : -1 
Second Largest : -1 
Explanation: Since there is only one element in the array, it is the largest and smallest element present 
in the array. There is no second largest or second smallest element present.
*/


import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        if(n < 2){
            System.out.println("Second Smallest : -1");
            System.out.println("Second Largest : -1");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] > smallest && arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }

            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }

        if(secondSmallest == Integer.MAX_VALUE)
            secondSmallest = -1;

        if(secondLargest == Integer.MIN_VALUE)
            secondLargest = -1;

        System.out.println("Second Smallest : " + secondSmallest);
        System.out.println("Second Largest : " + secondLargest);
        
    }
}
