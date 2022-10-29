package week1.RandomAlphabet;

public class AlphabetGenerator implements Generator<Character>{
    public Character generate(int num) {
        int rndNum = (int) (Math.random() * 26);
        char alphabet = (char) (rndNum + 65); //A=65
        return alphabet;
    }
}
