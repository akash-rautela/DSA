/*
4. Problem Statement – 
Write a function to solve the following equation a³ + a²b + 2a²b + 2ab² + ab² + b³. 
Write a program to accept three values in order of a, b and c and get the result of the above equation. */
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        // System.out.print("Enter the value of c: ");
        // int c = sc.nextInt();
        sc.close();
        int eq = (a*a*a) + (a*a*b) + (2*a*a*b) + (2*a*b*b) + (a*b*b) + (b*b*b);
        System.out.println("The result of the given equation is: "+ eq);
    }
}
