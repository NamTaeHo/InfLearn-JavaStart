package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; ; i++){

            sum += i;
            System.out.println("i = " + i + " sum = " + sum);
            if (sum > 10){
                break;
            }


        }

    }
}
