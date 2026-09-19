package service.rayne.prgs.Level1;

public class P134240 {
  public String solution(int[] food) {
    // 2로 나눠 홀수 버리고 인당 갯수 계산
    for (int i = 1; i < food.length; i++) {
      food[i] /= 2;
    }

    // 그릇에 담기
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < food.length; i++) {
      sb.append((i + "").repeat(food[i]));
    }

    sb.append(0);

    for (int i = food.length - 1; i > 0; i--) {
      sb.append((i + "").repeat(food[i]));
    }

    return sb.toString();
  }
}
