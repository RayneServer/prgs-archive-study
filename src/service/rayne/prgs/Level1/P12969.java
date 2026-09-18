package service.rayne.prgs.Level1;

import java.util.Scanner;

public class P12969 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    for (int i = 0; i < b; i++) {
      System.out.println("*".repeat(a));
    }
  }
}
