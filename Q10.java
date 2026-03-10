/*
10. Problem Statement – 
You’re given an array of integers, print the number of times each integer has occurred in the array. 
Example: 
Input: 
10 
1 2 3 3 4 1 4 5 1 2 
Output: 
1 occurs 3 times 
2 occurs 2 times 
3 occurs 2 times 
4 occurs 2 times 
5 occurs 1 times 
*/

import java.util.HashMap;
import java.util.Map;

public class Q10 {
    public static void count(int[] ar){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<ar.length; i++){
            if(map.containsKey(ar[i])){
                map.put(ar[i],map.get(ar[i])+1);
            }else{
                map.put(ar[i],1);
            }
        }
        for( Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.printf("%d occurs %d times\n", entry.getKey(), entry.getValue());
        }

    }
    public static void main(String[] args) {
        int[] ar = {1,2,3,3,4,1,4,5,1,2};
        count(ar);
    }
}
