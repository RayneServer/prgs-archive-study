package service.rayne.prgs.Level0;

public class P120902 {
  public int solution(String my_string) {
    String[] strArr = my_string.split(" ");

    int result = Integer.parseInt(strArr[0]);
    for (int i = 2; i < strArr.length; i += 2) {
      int num = Integer.parseInt(strArr[i]);

      if (strArr[i - 1].equals("+")) result += num;
      else result -= num;
    }

    return result;
  }
}
