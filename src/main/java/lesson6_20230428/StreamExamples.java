package lesson6_20230428;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples {
  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("Mary", "Jane", "Tom", "Edward", "Jimmy");
    Stream<String> stringStream = stringList.stream();

    Stream<String> stringStream2 = stringStream.sorted().peek(System.out::println);

    List<String> processedList = stringStream2.toList();
    System.out.println(processedList);
  }
}
