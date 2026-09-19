package service.rayne.prgs.Level1;

public class P176963 {
  public int[] solution(String[] name, int[] yearning, String[][] photo) {
    int[] resultArr = new int[photo.length];

    int idx = 0;
    for (String[] people : photo) {
      int point = 0;

      // 사진의 사람들을 그리움 리스트와 비교해 점수 부여
      for (int i = 0; i < people.length; i++) {
        String man = people[i];

        for (int j = 0; j < name.length; j++) {
          if (man.equals(name[j])) {
            point += yearning[j];
            break;
          }
        }
      }

      resultArr[idx++] = point;
    }

    return resultArr;
  }
}
