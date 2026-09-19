package service.rayne.prgs.Level1;

import java.util.ArrayList;
import java.util.List;

public class P42748 {
  public int[] solution(int[] array, int[][] commands) {
    // 결과 배열에 담아 반환
    int[] resultArr = new int[commands.length];
    for (int i = 0; i < resultArr.length; i++) {
      resultArr[i] = calc(array, commands[i][0] - 1, commands[i][1] - 1, commands[i][2] - 1);
    }

    return resultArr;
  }

  private int calc(int[] array, int left, int right, int idx) {
    // 배열 자르기
    List<Integer> myList = new ArrayList<>();
    for (int i = left; i <= right; i++) {
      myList.add(array[i]);
    }

    // 정렬 후 해당 인덱스 반환
    myList.sort(null);
    return myList.get(idx);
  }
}
