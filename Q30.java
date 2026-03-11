public class Q30 {
    public static void main(String[] args) {

        String s = "Capgemini";
        String rev = "";

        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }

        System.out.println(rev);
    }
}