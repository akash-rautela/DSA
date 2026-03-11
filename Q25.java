import java.util.*;

public class Q25 {
    public static void main(String[] args) {

        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int n : nums1)
            set1.add(n);

        for(int n : nums2){
            if(set1.contains(n))
                result.add(n);
        }

        System.out.println(result);
    }
}