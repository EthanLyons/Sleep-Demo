package edu.cnm.deepdive;

import java.util.Scanner;

public class Utility {

  static void processInput()  {
      Scanner scanner = new Scanner(System.in);
      while (true)  {
        String input = scanner.nextLine().trim();
        if (!input.isEmpty())  {
          System.out.println(input.toUpperCase());
        }
      }
  }

  static void takeNap(long duration) {
    try {
      System.out.printf("Going to sleep for %.2f seconds\u2026%n", duration /1000d);
      Thread.sleep(duration);
      System.out.println("\u2026waking up now");
    } catch (InterruptedException e) {
      //do nothing
    } finally {
    }
  }
}
