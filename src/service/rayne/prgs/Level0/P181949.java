package service.rayne.prgs.Level0;

import java.util.Scanner;

public class P181949 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);

      if (c > 'Z') stringBuilder.append((char) (c - 'a' + 'A'));
      else stringBuilder.append((char) (c - 'A' + 'a'));
    }

    System.out.println(stringBuilder);
  }
}
