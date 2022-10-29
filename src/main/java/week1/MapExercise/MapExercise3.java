package week1.MapExercise;

import java.util.HashMap;

//A-Z Map 출력
public class MapExercise3 {
    public static void main(String[] args) {
        String repoAddr = "https://github.com/dohyunre702/LikelionPractice";

        HashMap<String, Integer> alphabetMap = new HashMap<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabetMap.put(String.valueOf(c), 0);
        }
        System.out.println(alphabetMap);
    }
}