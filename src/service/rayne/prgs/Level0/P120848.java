package service.rayne.prgs.Level0;

public class P120848 {
  public int solution(int n) {
    int runner = 1;
    int result = 1;

    while (true) {
      if (result > n) return runner - 1;
      result *= ++runner;
    }
  }
}
