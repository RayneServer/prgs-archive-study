package service.rayne.prgs.Level0;

public class P181925 {
  public String solution(int[] numLog) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < numLog.length - 1; i++) {
      stringBuilder.append(numLog[i + 1] - numLog[i] == 1 ? "w" :
                            numLog[i + 1] - numLog[i] == -1 ? "s" :
                            numLog[i + 1] - numLog[i] == 10 ? "d" : "a");
    }

    return stringBuilder.toString();
  }
}
