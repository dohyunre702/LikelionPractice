package maxDataProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics {
    // 한 라인씩 읽어오기
    public String readByLine(String filename) {
        String fileContents;
        try ( //사용한 자원(BufferedREader) 자동 반납
            BufferedReader br = Files.newBufferedReader( //BufferedReader 객체 생성
                    Paths.get("./src/main/java/week1/maxDataProject/2021populationdata.csv"), StandardCharsets.UTF_8))
        {
            while ((fileContents = br.readLine()) != null) {
                fileContents += br.readLine();
                return fileContents;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }   return fileContents;
    }
}

