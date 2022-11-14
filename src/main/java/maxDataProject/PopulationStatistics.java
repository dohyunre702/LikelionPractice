package maxDataProject;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

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

    //라인 읽어오기(파싱 후 파일)
    public void readAllLines(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
        List<PopulationMove> pms = lines.parallelStream()
                .map(item -> {
                    String[] splittedLine = item.split(",");
                    return new PopulationMove(splittedLine[0], splittedLine[6]);
                }).collect(Collectors.toList());
        for (PopulationMove pm : pms) {
            System.out.println(pm.getFromSido());
        }
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

    //Map으로 변환 - 사람들이 서울에서 어디로 많이 떠났을까?
/* Map: 전입 도시 - 전출 도시를 key로, 이동 인구 수를 value로 구현
    {
     서울-경기도 : 1000,
     서울-인천광역시 : 2000,
     서울-세종시 : 3000
    }
 */
    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {
        Map<String, Integer> moveCntMap = new HashMap<>();
        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if(moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
    }

    public static void main(String[] args) throws IOException {
        String address = "C:/Users/dohyu/git/LikelionPractice/from_to.txt";
        String fromToAddress = "./from_to_txt";

        CreateAFile createAFile = new CreateAFile();

        PopulationStatistics ps = new PopulationStatistics();
        List<PopulationMove> pml = ps.readByLine(fromToAddress);

        Map<String, Integer> map = ps.getMoveCntMap(pml);

        String targetFilename = "./each_sido_cnt.txt";
        createAFile.createAFile(targetFilename);
        List<String> cntResult = new ArrayList<>();
        for(String key : map.keySet()) {
            String s = String.format("key:%s value:%d\n", key, map.get(key));
            cntResult.add(s);
        }
        ps.write(cntResult,targetFilename);
    }
}
