package week1.read;

import java.io.FileReader;
import java.io.IOException;

//지정한 파일의 맨 앞 한 byte를 읽어오는 method
public class ReadAFile {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("./src/main/java/week1/read/8842height.txt");
        char c = (char) reader.read();
        System.out.println(c);
    }
}
