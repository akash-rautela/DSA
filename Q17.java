public class Q17 {
    public static void main(String[] args) {

        int nums[] = {3,0,1};

        int n = nums.length;

        int total = n * (n + 1) / 2;

        int sum = 0;

        for(int num : nums){
            sum += num;
        }

        int missing = total - sum;

        System.out.println("Missing Number: " + missing);
    }
}