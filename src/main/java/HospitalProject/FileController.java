package HospitalProject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileController<T> { //Hospital, Population 타입 모두 받을 수 있게
    Parser<T> parser;
    boolean isRemoveColumnName = true;

    //constructor
    public FileController(Parser<T> parser) {
        this.parser = parser;
    }

    public FileController(Parser<T> parser, boolean isRemoveColumnName) {
        this.parser = parser;
        this.isRemoveColumnName = isRemoveColumnName;
    }

    //파일 읽기
    List<T> readLines(String filename) throws IOException{
       BufferedReader br = new BufferedReader(new FileReader(filename));
       List<T> result = new ArrayList<>();
       String str;

        //첫번째 라인이 각 Column에 대한 설명이면 빼고 나머지를 읽는다
       if(isRemoveColumnName) br.readLine();
       while ((str = br.readLine()) != null) {
           result.add(parser.parse(str));
       }
       return result;
    }

    //새 파일 생성
    public void createANewFile(String filename) throws IOException {
        File file = new File(filename);
        file.createNewFile();
        System.out.println("파일 생성되었는지?"+file.exists());
    }

    //파일에 쓰기
    public void writeLines(List<String> lines, String filename) throws IOException {
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
            for (String str : lines) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("success");
    }
}
