import java.util.*;

public class Q27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        sc.close();
        if(month >= 3 && month <= 5)
            System.out.println("Season: Spring");
        else if(month >= 6 && month <= 8)
            System.out.println("Season: Summer");
        else if(month >= 9 && month <= 11)
            System.out.println("Season: Autumn");
        else if(month == 12 || month == 1 || month == 2)
            System.out.println("Season: Winter");
        else
            System.out.println("Invalid Month Entered");
    }
}