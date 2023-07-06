package lesson9_20230519;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
1. Создайте файл, используя FileOutputStream, с текстом: "This is my first experience when I myself work with IO API. I can do everything!"
2. Создайте файл используя new File() в каталоге folder, убедитесь, что файл существует, удалите файл.
*/
public class Main {
  public static void main(String[] args) {
    task1();
    task2();
  }

  private static void task2() {
    File dir = new File("src/main/resources/newDir");
    dir.mkdir();
    File file = new File("src/main/resources/newDir/text_new2.txt");
    if (file.exists()) {
      file.delete();
    } else
      try {
        file.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
  }

  private static void task1() {
    String data = "This is my first experience when I myself work with IO API. I can do everything!";

    try (FileOutputStream outputStream = new FileOutputStream(new File("src/main/resources/text_new.txt"))) {
      byte[] array = data.getBytes();
      outputStream.write(array);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
