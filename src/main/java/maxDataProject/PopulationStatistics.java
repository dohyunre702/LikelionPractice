package maxDataProject;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatistics {
    Parser ps = new Parser();

    public List<PopulationMove> readByLine(String filename) throws IOException {
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while ((str = reader.readLine()) != null) {
            PopulationMove pm = ps.parse(str);
            pml.add(pm);

        }
        reader.close();
        return pml;
    }

    public void write(List<String> strs, String filename) {
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
                e.printStackTrace();
            }
    }

    public static void main(String[] args) throws IOException {
        String address = "C:/Users/dohyu/git/LikelionPractice/src/main/java/maxDataProject/2021populationdata.csv";
        //readLineContext new 할 때 Type(PopulationMove)-파싱로직(DoSomething의 구현체) 넣어서 생성.
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(address);

        // 파일 열 크기 출력 System.out.println(pml.size());
        List<String> strings = new ArrayList<>();
        strings.add("11,11");
        populationStatistics.write(strings, "./from_to.txt");


    }
}

