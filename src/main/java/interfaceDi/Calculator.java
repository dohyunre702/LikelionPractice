package interfaceDi;

import java.util.Scanner;

public class Calculator {
    public int plus(int a, int b) {
        return a + b;
    }
    public int minus(int a, int b) {
        return a - b;
    }
    public int multiple(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        int x = 0;
        try {
            if (b != 0) {
                x = a / b;
            }
        } catch (ArithmeticException e) {
                x = 0;
        }
        return x;
    }

}
