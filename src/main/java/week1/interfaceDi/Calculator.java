package week1.interfaceDi;

public class Calculator {

    private int a;
    private int b;

    public Calculator() {
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //getter를 쓰면 메소드에 매개변수를 여러 번 넣지 않고도
    //호출된 인스턴스에 바로 값을 넣어줄 수 있다.
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int plus(){
        return a + b;
    }
    public int minus() {
        return a - b;
    }
    public int multiple() {
        return a * b;
    }
    public int divide() {
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
