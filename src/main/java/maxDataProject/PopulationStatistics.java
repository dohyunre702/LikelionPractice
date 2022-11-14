package maxDataProject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatistics {
    Parser ps = new Parser();

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getToSido() +"\n";
    }

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

    //파일에 저장
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
        //데이터 수 10000개로 줄여서 진행
        PopulationStatistics populationStatistics = new PopulationStatistics();

        String address = "C:/Users/dohyu/git/LikelionPractice/src/main/java/maxDataProject/2021populationdata.csv";
        //readLineContext new 할 때 Type(PopulationMove)-파싱로직(DoSomething의 구현체) 넣어서 생성.
        List<PopulationMove> pml = populationStatistics.readByLine(address);
        List<String> strings = new ArrayList<>();
        for (PopulationMove pm : pml) {
            String fromTo = populationStatistics.fromToString(pm);
            strings.add(fromTo);
        }
        populationStatistics.write(strings, "./from_to.txt"); //22초만에 10만 건 작성
    }
}
