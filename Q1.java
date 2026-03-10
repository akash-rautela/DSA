/*
1. Check if a Number is Prime: 
Problem: Write a function to check if a given number is prime. 
Input: Number: 29 
Output: True 
Explanation: 29 is a prime number. 
 */

import java.util.*;
class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int n = sc.nextInt();
        sc.close();
        if(n==1){
            System.out.printf("The number %d is not prime.",n);
            return;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i ==0){
                System.out.printf("The number %d is not prime.",n);
                return;
            }
        }
        System.out.printf("The number %d is prime",n);
    }
}