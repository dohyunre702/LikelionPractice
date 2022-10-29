package week1.MapExercise;

//특정 string에 있는 알파벳 개수 세기
public class MapExercise2 {

    //이대로라면 0
    public void map2 (String s) {
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int c = (int)s.charAt(i);

            if (c >= 65 && c <= 90 || c>=97 && c<=122) {
                arr[i] = c;
            }
            else
                continue;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%s, ", arr[i]);
        }
    }

    public static void main(String[] args) {
        MapExercise2 mapexercise = new MapExercise2();
        mapexercise.map2("abcde1f2g");
    }
}
