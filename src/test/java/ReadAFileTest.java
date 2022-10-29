import org.junit.jupiter.api.Test;

import java.io.File;

public class ReadAFileTest {
//현재 디렉토리 파일 목록 조회
    @Test
    void fileList() {
        File dir = new File("./");
        File files[] = dir.listFiles();
        //System.out.println(files[0]) 현재 디렉토리의 첫번째 파일명
        for (File file : files) {
            System.out.println(file);
        }
    }
}
