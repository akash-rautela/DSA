public class Q26 {
    public static void main(String[] args) {

        String str = "Move#Hash#to#Front";
        String hash = "";
        String text = "";

        for(char c : str.toCharArray()){
            if(c == '#')
                hash += c;
            else
                text += c;
        }

        System.out.println(hash + text);
    }
}