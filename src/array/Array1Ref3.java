package array;

public class Array1Ref3 {

    public static void main(String[] args) {

        int[] students = {90,80,70,60,50,50,64,45,87}; //배열 변수 선언



        for (int i = 0; i < students.length; i++ ) {
            System.out.println("학생" + (i + 1) + ": " + students[i]);

        }


    }
}
