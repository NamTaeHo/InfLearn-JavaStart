package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input String: ");
        String str = scanner.nextLine(); //입력을 스트링으로 가져옴
        System.out.println("Input String: " + str);

        System.out.print("Input Integer: ");
        int intValue = scanner.nextInt();
        System.out.println("Input Integer: " + intValue);

        System.out.print("Input Double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("Input DoubleValue = " + doubleValue);

    }
}
