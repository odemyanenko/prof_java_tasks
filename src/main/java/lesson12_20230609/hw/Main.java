package lesson12_20230609.hw;

/*
Задачки по многопоточности:

1. Взять  пример расчетной задачи (см. слайды к занятию):
   найти и посчитать все целые числа в диапазоне от Integer.MIN_VALUE до Integer.MAX_VALUE,
   которые делятся на заданное целое число без остатка.
   Решить данную задачу последовательно и параллельно в нескольких потоках.
   Сравнить время выполнения.

2. Имеется счет BankAccount, на котором хранится определенная сумма денег (int sum).
Реализовать с помощью synchronized потокобезопасный метод пополнения счета - deposit(int amount), снятия со счета - withdraw(int amount).
*/

import lesson12_20230609.Primes;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    int number = inputNumber("Please, enter number...");

    long start = System.nanoTime();
    CheckNumberDivide1(number);
    long end = System.nanoTime();
    System.out.println("Time: " + (end - start));

    System.out.println("------------------------------------");

    Task task1 = new Task(Integer.MIN_VALUE, 0, number);
    Task task2 = new Task(0, Integer.MAX_VALUE, number);

    Thread thread1 = new Thread(task1);
    Thread thread2 = new Thread(task2);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    int result = task1.result + task2.result;
    end = System.nanoTime();
    System.out.println("Total numbers of primes: " + result);
    System.out.println("Time: " + (end - start));

  }

  public static int inputNumber(String message) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(message);
    return scanner.nextInt();
  }

  public static int CheckNumberDivide1(int num) {
    int count = 0;
    for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
      if (i % num == 0)
        count++;
    }
    System.out.println("Total divisible by " + num + ": " + count);

    return count;
  }
}
