package service.rayne.prgs.Level0;

public class P181849 {
  public int solution(String num_str) {
    int answer = 0;
    for (String s : num_str.split("")) {
      answer += Integer.parseInt(s);
    }

    return answer;
  }
}
