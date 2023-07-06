package lesson12_20230609;

public class Counter2 {
  private int count;
  private Object lock = new Object();

  public void increment() {
    synchronized (lock) {
      count++;
    }
  }

  public int getCount() {
    synchronized (lock) {
      return count;
    }
  }
}
