package maxDataProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PopulationStatistics {
    // 한 라인씩 읽어오기
    public String readByLine(String filename) throws IOException {
        //FileReader fileReader = new FileReader("./src/main/java/week1/maxDataProject/2021populationdata.csv");
        BufferedReader br = new BufferedReader(new FileReader("./src/main/java/week1/maxDataProject/2021populationdata.csv"));

        String fileContents = "";
        while ((fileContents = br.readLine()) != null) {
            fileContents += br.readLine();
        }
        br.close();
        return fileContents;
    }
}

