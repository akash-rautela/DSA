/*
2. Pythagorean Triplets: 
Problem: Generate all Pythagorean triplets with values smaller than a given limit. 
Input: limit = 20 
Output: 
3  4  5 
8  6 10 
5 12 13 
15 8 17 
12 16 20 
Explanation: The triplets satisfy the condition a² + b² = c², where a, b, and c are integers. 
*/

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        for(int i = 1; i<limit; i++){
            for(int j= i+1; j<limit; j++){
                double res = Math.sqrt(i*i + j*j);
                if(res%1==0){
                    System.out.println(i + " " + j + " " + (int)res);
                }
            }
        }
        sc.close();
    }
}
