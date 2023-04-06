package lesson1_20230310;

public enum Subject {
  MATH("Mathematics"),
  PHYSICS("Physics"),
  HISTORY("History"),
  SCIENCE("Science"),
  COMPUTER("Computer")
  ;

  private final String value;

  Subject(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}
