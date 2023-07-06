package lesson12_20230609;

public class SynchronizationExample {
  public static void main(String[] args) {
    Counter2 counter = new Counter2();

    // Create multiple threads that increment the counter concurrently
    for (int i = 0; i < 10; i++) {
      Thread thread = new Thread(() -> {
        for (int j = 0; j < 1000; j++) {
          counter.increment();
        }
      });
      thread.start();
    }

    // Wait for all threads to complete
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Print the final count
    System.out.println("Final count: " + counter.getCount());
  }
}

