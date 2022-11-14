package maxDataProject;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PopulationStatisticsTest {

    @Test
    void writeTest() {
        String address = "11,110,51500,2021,01,04,11,110,51500,5,1,033,1,,,,,,,,,,,,,,,,,,,,,,,,,,,,9";

        PopulationStatistics ps = new PopulationStatistics();
        List<String> strings = new ArrayList<>();

        String[] split = address.split(",");
        strings.add(split[0]);
        strings.add(split[6]);

        ps.write(strings, "./from_to.txt");
        }
    }
