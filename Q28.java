public class Q28 {
    public static void main(String[] args) {

        String path = "UDDDUDUU";
        int level = 0, valleys = 0;

        for(char step : path.toCharArray()){

            if(step == 'U')
                level++;
            else
                level--;

            if(level == 0 && step == 'U')
                valleys++;
        }

        System.out.println("Valleys: " + valleys);
    }
}