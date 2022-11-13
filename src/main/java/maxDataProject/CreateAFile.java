package maxDataProject;

import java.io.File; //파일 생성 클래스
import java.io.IOException;

//파일 생성
public class CreateAFile {
    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
