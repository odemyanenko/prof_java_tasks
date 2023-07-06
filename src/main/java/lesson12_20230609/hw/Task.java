package lesson12_20230609.hw;

public class Task implements Runnable {
  int start;
  int end;
  int num;
  int result = 0;


  public Task(int start, int end, int num) {
    this.start = start;
    this.end = end;
    this.num = num;
  }

  @Override
  public void run() {
    for (int i = start; i < end; i++) {
      if (i % num == 0)
        return;
      result++;
    }
    System.out.println("Total divisible by " + num + ": " + result);
  }
}
