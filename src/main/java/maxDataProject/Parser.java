package maxDataProject;

public class Parser {
    //읽어 온 파일을 특정 문자로 분리한다
    public PopulationMove parse(String data) {
        int fromSido = 0, toSido = 0;

        String[] split = data.split(",");

        //새로운 PopulationMove 객체를 생성한다
        //저장한 파일 불러와서 파싱하기 위해 로직 변경
        return new PopulationMove(split[0], split[1]);

    }
}
