package RandomNumber;

//random number 50개를 생성하고 중복되지 않는 숫자만 남기기

public class RandomNumberGeneratorMain {
    public static void main(String[] args) {

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        for(int i = 0; i < 50; i++) {
            int r = randomNumberGenerator.generate(10);
            System.out.println(r);
        }
    }
}
