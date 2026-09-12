package service.rayne.prgs.Level0;

public class P120923 {
  public int[] solution(int num, int total) {
    int[] answer = new int[num];
    int leftIdx = 1;
    int rightIdx = num;

    int sum = (num * (num + 1)) / 2;
    while (true) {
      if (sum == total) break;

      if (sum > total) {
        sum += --leftIdx;
        sum -= rightIdx--;
      } else {
        sum += ++rightIdx;
        sum -= leftIdx++;
      }
    }

    int pointer = 0;
    for (int i = leftIdx; i <= rightIdx; i++) {
      answer[pointer++] = i;
    }

    return answer;
  }
}
