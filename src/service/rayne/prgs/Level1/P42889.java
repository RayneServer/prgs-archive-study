package service.rayne.prgs.Level1;

import java.util.ArrayList;
import java.util.List;

public class P42889 {
  private class Fail {
    int num;
    double fail;

    Fail(int num, double fail) {
      this.num = num;
      this.fail = fail;
    }
  }

  public int[] solution(int N, int[] stages) {
    // 모든 문제의 도전자 수
    double[] challenges = new double[N + 1];
    for (int stage : stages) {
      if (stage > N) stage = N;

      for (int i = 1; i <= stage; i++) challenges[i] += 1;
    }

    // 모든 문제의 미클자 수
    double[] failure = new double[N + 1];
    for (int stage : stages) {
      if (stage > N) continue;

      failure[stage] += 1;
    }

    // 문제 별 실패율을 담은 리스트 생성
    List<Fail> failList = new ArrayList<>();
    for (int i = 1; i <= N; i++) {
      double failValue = 0;
      if (challenges[i] != 0 && failure[i] != 0) failValue = failure[i] / challenges[i];

      failList.add(new Fail(i, failValue));
    }

    // 실패율이 높은 순서대로 정렬
    failList.sort((o1, o2) -> {
      if (o1.fail == o2.fail) return o1.num - o2.num;

      return o1.fail - o2.fail > 0 ? -1 : 1;
    });

    // 배열에 담아 반환
    int[] result = new int[N];
    for (int i = 0; i < result.length; i++) {
      result[i] = failList.get(i).num;
    }

    return result;
  }
}
