package RandomAlphabet;

import java.util.HashSet;
import java.util.Set;

//set exercise2
//A-Z까지 랜덤 알파벳 50개 생성하고 중복제거
public class AlphabetGeneratorMain {
    public static void main(String[] args) {
        AlphabetGenerator alphabetGenerator = new AlphabetGenerator();
        Set<Character> characters = new HashSet<>();
        int cnt = 0;

        while (cnt < 30) {
            characters.add(alphabetGenerator.generate(0));
            cnt += 1;
        }
        System.out.println(characters);
        System.out.println(characters.size());
    }
}
