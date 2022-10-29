package RandomNumber;

//random number 50개를 생성하고 중복되지 않는 숫자만 남기기
public class RandomNumberGeneratorMain {
    public static void main(String[] args) {

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(); //randomNumber
        PlusGenerator plusGenerator = new PlusGenerator(); //매개변수 + randomNumber

        for(int i = 0; i < 50; i++) {
            int r = randomNumberGenerator.generate(10);
            int p = plusGenerator.generate(10);
            System.out.printf("r: %d\n", r);
            System.out.printf("p: %d\n", p);
        }
    }
}
