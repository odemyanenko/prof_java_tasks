package lesson2_20230317;

public sealed class IncreaseValue implements Changeable permits Multiplay{

  @Override
  public int change(int count, int value) {
    return (count + value);
  }
}
