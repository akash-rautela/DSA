import java.util.*;

public class Q18 {
    public static void main(String[] args) {

        int arr[] = {1,3,4,2,2};
        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            if(set.contains(num)){
                System.out.println("Duplicate: " + num);
                break;
            }
            set.add(num);
        }
    }
}