package week1.read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileExercise {
    //지정한 파일의 맨 앞 한 byte를 읽어오는 method
    public char readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char) fileReader.read();
    }
}

public class ReadAFile {
    public static void main(String[] args) throws IOException {
        FileExercise fileExercise = new FileExercise();
        char c = fileExercise.readAChar("./src/main/java/week1/read/8842height.txt");
        System.out.println(c);
    }
}