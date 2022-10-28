package interfaceDi;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Calculator calculator = new Calculator();
        System.out.println(calculator.plus(num1, num2));
    }
}
