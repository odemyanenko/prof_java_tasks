package lesson9_20230519;

import java.io.*;

public class ReadFileExample {
  public static void main(String[] args) {
    try (FileReader reader = new FileReader(new File("src/main/resources/text.txt"));
         BufferedReader bufferedReader = new BufferedReader(reader);) {
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
