package interfaceDi;

import java.util.Scanner;

public class RandomCalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        RandomCalculator randomCalculator = new RandomCalculator(num1);
        int x = randomCalculator.plus();
        System.out.println(x);
    }
}
