package service.rayne.prgs.Level0;

public class P120894 {
  public long solution(String numbers) {
    StringBuilder sb = new StringBuilder();
    while (numbers.length() > 0) {
      if (numbers.startsWith("zero")) {
        sb.append("0");
        numbers = numbers.substring(4);
        continue;
      }

      if (numbers.startsWith("one")) {
        sb.append("1");
        numbers = numbers.substring(3);
        continue;
      }

      if (numbers.startsWith("two")) {
        sb.append("2");
        numbers = numbers.substring(3);
        continue;
      }

      if (numbers.startsWith("three")) {
        sb.append("3");
        numbers = numbers.substring(5);
        continue;
      }

      if (numbers.startsWith("four")) {
        sb.append("4");
        numbers = numbers.substring(4);
        continue;
      }

      if (numbers.startsWith("five")) {
        sb.append("5");
        numbers = numbers.substring(4);
        continue;
      }

      if (numbers.startsWith("six")) {
        sb.append("6");
        numbers = numbers.substring(3);
        continue;
      }

      if (numbers.startsWith("seven")) {
        sb.append("7");
        numbers = numbers.substring(5);
        continue;
      }

      if (numbers.startsWith("eight")) {
        sb.append("8");
        numbers = numbers.substring(5);
        continue;
      }

      if (numbers.startsWith("nine")) {
        sb.append("9");
        numbers = numbers.substring(4);
        continue;
      }
    }

    return Long.parseLong(sb.toString());
  }
}
