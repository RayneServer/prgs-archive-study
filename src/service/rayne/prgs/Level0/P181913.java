package service.rayne.prgs.Level0;

public class P181913 {
  public String solution(String my_string, int[][] queries) {
    String[] strArr = my_string.split("");

    for (int i = 0; i < queries.length; i++) {
      int leftIdx = queries[i][0];
      int rightIdx = queries[i][1];

      String[] revStr = new StringBuilder(my_string.substring(leftIdx, rightIdx + 1)).reverse().toString().split("");

      for (int j = leftIdx; j <= rightIdx; j++) {
        strArr[j] = revStr[j - leftIdx];
      }

      my_string = String.join("", strArr);
    }

    return String.join("", strArr);
  }
}
