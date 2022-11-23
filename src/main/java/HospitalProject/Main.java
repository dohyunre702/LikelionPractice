package HospitalProject;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        fileController<Hospital> hospitalLineReader = new fileController<>(new HospitalParser(), true);
        //LineReader 클래스로 객체 만들고 Hospital 타입 읽기.
        //멤버변수로는 HospitalParser를 받고, isRemove = true라서 첫 줄을 지운다

        String filename = "";

        List<Hospital> hospitals = hospitalLineReader.readLines(filename);
        // HospitalParser가 LineReader 들어왔으니 Parser의 parse()는 id에 splitted[0]이 들어간 Hospital 객체이다.
        // readLines 메소드는 그 결과들을(splitted[0]이 들어가 생성된 Hospital 객체) 리스트에 계속 더하여 리턴한다. 즉 hospital는 Hospital 객체들의 리스트가 된다.

        for (Hospital hospital : hospitals) {
            System.out.println(hospital.getSqlInsertQuery()); // Hospital 클래스에서 정의한 게터로 id를 뽑으면 잘 나온다.
        }
    }
}
