package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        for(; ; ){

            sum += i;
            System.out.println("i = " + i + " sum = " + sum);
            if (sum > 10){
                break;
            }
            i++;
        }
    }


}
