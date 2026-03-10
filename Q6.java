/*
6. Problem Statement 
Mayuri buys “N” no of products from a shop. The shop offers a different percentage of discount on 
each item. She wants to know the item that has the minimum discount offer, so that she can avoid 
buying that and save money. 
[Input Format: The first input refers to the no of items; the second input is the item name, price and 
discount percentage separated by comma (,) ] Assume the minimum discount offer is in the form of 
Integer. 
Note: There can be more than one product with a minimum discount. 
Sample Input 1: 
4 
mobile,10000,20 
shoe,5000,10 
watch,6000,15 
laptop,35000,5 
Sample Output 1: 
shoe 
Explanation: The discount on the mobile is 2000, the discount on the shoe is 500, the discount on the 
watch is 900 and the discount on the laptop is 1750. So the discount on the shoe is the minimum.
*/
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lowest=" ";
        double disc = 0.0;
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        System.out.println("enter the product details: (name, price, discount) separated by space:");
        for( int  i = 0; i<n; i++){
            System.out.printf("Product %d: ",i);
            String name = sc.next();
            double price = sc.nextDouble();
            double d = sc.nextDouble();
            d = (d/100)*price;
            if(disc == 0.0){
                disc = d;
            }
            if(d <= disc){
                lowest = name;
                disc = d;
            }
        }
        System.out.println(lowest);
        sc.close();
    }
}
