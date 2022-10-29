package week1.read;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NewBufferedReader {
    public void read() {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get("afile.txt"), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        NewBufferedReader newBufferedReader = new NewBufferedReader();
        newBufferedReader.read();
    }
}
