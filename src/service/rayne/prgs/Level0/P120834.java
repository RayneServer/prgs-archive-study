package service.rayne.prgs.Level0;

public class P120834 {
  public String solution(int age) {
    String[] inputArr = String.valueOf(age).split("");

    for (int i = 0; i < inputArr.length; i++) {
      char c = (char) ('a' + Integer.parseInt(inputArr[i]));
      inputArr[i] = String.valueOf(c);
    }

    return String.join("", inputArr);
  }
}
