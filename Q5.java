/*
5. Problem Statement 
A function is there which tells how many dealerships there are and the total number of cars in each 
dealership. 
Your job is to calculate how many tyres would be there in each dealership. 
Input: 
3 
4 2 
4 0 
1 2 
Output: 
20 
16 
8 
There are total 3 dealerships 
dealerships1 contains 4 cars and 2 bikes 
dealerships2 contains 4 cars and 0 bikes 
dealerships3 contains 1 cars and 2 bikes 
Total number of tyres in dealerships1 is (4 × 4) + (2 × 2) = 20 
Total number of tyres in dealerships2 is (4 × 4) + (0 × 2) = 16 
Total number of tyres in dealerships3 is (1 × 4) + (2 × 2) = 8
*/
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total no of dealerships: ");
        int dealerships = sc.nextInt();
        int[] tyres = new int[dealerships];
        for(int i = 0; i<dealerships; i++){
            System.out.printf("No. of cars in dealership: %d ", (i+1));
            int c = sc.nextInt();
            System.out.printf("No. of bikes in dealership: %d ", (i+1));
            int b = sc.nextInt();
            tyres[i]= (c*4) + (b*2);
        }
        for(int i = 0; i<dealerships; i++){
            System.out.printf("Total number of tyres in dealership %d is: %d \n", (i+1), tyres[i]);
        }
        sc.close();
    }
}
