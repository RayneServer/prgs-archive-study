package service.rayne.prgs.Level1;

public class P17681 {
  public String[] solution(int n, int[] arr1, int[] arr2) {
    String[] resultArr = new String[n];

    for (int i = 0; i < n; i++) {
      // 두 지도의 해당 행을 이진수로 변환
      String[] mapA = toBin(arr1[i], n).split("");
      String[] mapB = toBin(arr2[i], n).split("");

      // 지도를 합쳐서 벽과 빈 공간 확인
      String[] result = new String[n];
      for (int j = 0; j < resultArr.length; j++) {
        if (mapA[j].equals("1") || mapB[j].equals("1")) result[j] = "#";
        else result[j] = " ";
      }

      // 최종 지도 결과를 배열에 입력
      resultArr[i] = String.join("", result);
    }

    return resultArr;
  }

  private String toBin(int num, int length) {
    StringBuilder sb = new StringBuilder();

    while (num > 0) {
      sb.append(num % 2);
      num /= 2;
    }

    while (sb.length() < length) {
      sb.append(0);
    }

    return sb.reverse().toString();
  }
}
