package service.rayne.prgs.Level0;

public class P120868 {
  public int solution(int[] sides) {
    int count = 0;
    for (int i = 1; i < sides[0] + sides[1]; i++) {
      if (isTri(i, sides[0], sides[1])) count++;
    }

    return count;
  }

  private boolean isTri(int numA, int numB, int numC) {
    if (numA + numB <= numC) return false;
    if (numA + numC <= numB) return false;
    if (numC + numB <= numA) return false;

    return true;
  }
}
