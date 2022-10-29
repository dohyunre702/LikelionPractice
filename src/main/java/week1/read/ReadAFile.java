package week1.read;

import java.io.FileReader;
import java.io.IOException;

class FileExercise {

    private void FileReader(String filename) {
        this.filename;
    };


    //지정한 파일의 맨 앞 한 byte를 읽어오는 method
    public char readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char) fileReader.read();
    }

    //2글자 읽어오는 method
    public String read2Chars(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;
    }

    //N글자 읽어오는 method. N은 파라미터로, filename은 생성자로 받을 것. >?
    public String readNChars(int N) throws IOException {
        FileReader fileReader = new FileReader(this.filename);
        String str = "";
        for (int i = 0; i < N; i++) {
            int asciiCd = fileReader.read();
            if (asciiCd == -1) { //read() 메소드는, stream의 끝에서 -1을 리턴
                return str;
            }
            str += (char) asciiCd;
        }
        return str;
    }
}

public class ReadAFile {
    public static void main(String[] args) throws IOException {
        FileExercise fileExercise = new FileExercise();
        char c = fileExercise.readAChar("./src/main/java/week1/read/8842height.txt");
        String str = fileExercise.read2Chars("./src/main/java/week1/read/8842height.txt");
        String str2 = fileExercise.readNChars(5);

        System.out.printf("%c\n%s\n%s", c, str, str2);
    }
}