package week1.RandomNumber;

public class PlusGenerator implements NumberGenerator {

    @Override
    public int generate(int num) {
        return num + (int)(Math.random() * 10);
    }
}
