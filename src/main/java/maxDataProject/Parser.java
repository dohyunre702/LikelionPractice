package maxDataProject;

public class Parser {
    //읽어 온 파일을 특정 문자로 분리한다
    public PopulationMove parse(String data) {
        int fromSido = 0, toSido = 0;

        String[] split = data.split(",");

        fromSido = Integer.parseInt(split[0]);
        toSido = Integer.parseInt(split[6]);

        //새로운 PopulationMove 객체를 생성한다
        //생성자를 활용해 전입 도시, 전출 도시 값을 초기화한다
        return new PopulationMove(fromSido, toSido);

    }
}
