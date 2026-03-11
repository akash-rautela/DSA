public class Q29 {
    public static void main(String[] args) {

        String str = "aabbbbeeeeffggg";
        int count = 1;

        for(int i=0;i<str.length();i++){

            if(i+1 < str.length() && str.charAt(i) == str.charAt(i+1))
                count++;
            else{
                System.out.print(str.charAt(i) + "" + count);
                count = 1;
            }
        }
    }
}