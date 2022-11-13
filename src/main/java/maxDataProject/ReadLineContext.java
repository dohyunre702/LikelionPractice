package maxDataProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLineContext<T> {
    DoSomething<T> doSomething;
    Parser ps = new Parser();

    // 한 라인씩 읽어오기
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
}