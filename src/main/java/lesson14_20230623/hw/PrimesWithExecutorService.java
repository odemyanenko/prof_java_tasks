package lesson14_20230623.hw;

import java.util.concurrent.*;

public class PrimesWithExecutorService {
  static class Task implements Callable<Integer> {
    int start;
    int end;

    public Task(int start, int end) {
      this.start = start;
      this.end = end;
    }

    @Override
    public Integer call() throws Exception {
      int result = 0;

      for (int i = start; i < end; i++) {
        boolean isPrime = true;

        for (int j = 2; j < i; j++) {
          if (i % j == 0) {
            isPrime = false;
            break;
          }
        }

        if (isPrime) {
          result++;
        }
      }
      System.out.println(Thread.currentThread().getName() + " result: " + result);
      return result;
    }
  }

  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(3);

    Future<Integer> future1 = executor.submit(new PrimesWithExecutorService.Task(2, 80_000));
    Future<Integer> future2 = executor.submit(new PrimesWithExecutorService.Task(80_000, 150_000));
    Future<Integer> future3 = executor.submit(new PrimesWithExecutorService.Task(150_000, 200_000));

    int sum = 0;

    try {
      sum = future1.get() + future2.get() + future3.get();
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }

    System.out.println("Primes count: " + sum);

    executor.shutdown();
  }
}

