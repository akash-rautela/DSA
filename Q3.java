/*

3. Problem Statement:– 
Raj wants to know the maximum marks scored by him in each semester. The mark should be between 
0 to 100; if it goes beyond the range display “You have entered invalid mark.” 
Sample Input 1: 
Enter no of semester: 3 
Enter no of subjects in 1 semester: 3 
Enter no of subjects in 2 semester: 4 
Enter no of subjects in 3 semester: 2 
Marks obtained in semester 1: 50 60 70 
Marks obtained in semester 2: 90 98 76 67 
Marks obtained in semester 3: 89 76 
Sample Output 1: 
Maximum mark in 1 semester: 70 
Maximum mark in 2 semester: 98 
Maximum mark in 3 semester: 89 
*/
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of semester: ");
        int semester = sc.nextInt();
        int[] sem = new int[semester];
        for(int i = 1; i<= semester; i++){
            System.out.printf("Enter no of subjects in %d semester: ",i);
            sem[i-1]=sc.nextInt();
        }
        for(int i =0;i<semester; i++){
            int subs = sem[i];
            int temp = -1;
            int j = 0;
            System.out.printf("Marks obtained in semester %d: ",i+1);
            while(j<subs){
                int t = sc.nextInt();
                if(t<0 || t>100){
                    System.out.println("You have entered invalid mark.");
                    continue;
                }
                if(t>temp){
                    temp = t;
                }
                j++;
            }
            sem[i] = temp;
        }
        for(int i = 0; i<semester; i++){
            System.out.printf("Maximum mark in %d semester: %d \n",i,sem[i]);
        }
        sc.close();
    }
}
