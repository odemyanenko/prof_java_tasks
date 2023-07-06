package lesson7_20230505;

public class Word implements Comparable<Word> {

  int count;
  String value;

  public Word(int count, String value) {
    this.count = count;
    this.value = value;
  }

  @Override
  public String toString() {
    return "Word{" + "count=" + count + ", value='" + value + '\'' + '}';
  }

  @Override
  public int compareTo(Word o) {
    return o.count - count;
  }
}
