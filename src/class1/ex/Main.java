package class1.ex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int count = scanner.nextInt();
      int superCount = count;
      int reverseCount = 1;
      count -= 1;

      for(int j = 0; j < superCount ; j++) {
          for (int i = 0; i < count; i++) {
              System.out.print(" ");
          }
          for (int i = 0; i < reverseCount; i++) {
              System.out.print("*");
          }
          count--;
          reverseCount++;
          System.out.println();
      }
    }
}
