package week1.MapExercise;

import java.util.HashMap;

class AlphabetCnt {
    //a부터 z까지
    public boolean isAlphabet(char ch) {
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return true;
        }
        return false;
    }
}

//A-Z Map 출력
public class MapExercise3 {
    //map으로 a-z까지 0 할당
    public static void main(String[] args) {
        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabetMap.put(c, 0);
        }
        //인스턴스 선언
        AlphabetCnt alphabetCnt = new AlphabetCnt();
        //char 맞추기 위해 변수 조정
        String s1 = "abbcedfwlekdmddkskd".toUpperCase();

        //cnt 1개씩 올리기
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            boolean isAlphhabet = alphabetCnt.isAlphabet(c);
            if(isAlphhabet){ //개수 세기
                alphabetMap.put(c, alphabetMap.get(c) + 1);
            }
        }
        System.out.println(alphabetMap);
    }
}