package interfaceDi;

public class RandomCalculator implements RandomDI{
    //인터페이스에 선언된 추상 메소드의 실체 메소드 선언
    public int a;
    public int randomNumber = (int) (Math.random() * 10);

    public RandomCalculator() {
    }

    public RandomCalculator(int a) {
        this.a = a;
    }

    //methods
    public int plus() {
        return a + randomNumber;
    }

    public int minus() {
        return a - randomNumber;
    }

    public int multiple() {
        return a * randomNumber;
    }

    public void divide() {
        try {
            if (randomNumber !=0) {
                System.out.println(a / randomNumber);
                }
            } catch (ArithmeticException e) {
            System.out.print("랜덤하게 생성된 숫자가 0입니다.");
        }
    }

    public int generate(int num) {
     return randomNumber;
    }
}
