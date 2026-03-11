
public class Q32 {
    public static void main(String[] args) {

        String s = "leetcode";

        for(int i=0;i<s.length();i++){

            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}