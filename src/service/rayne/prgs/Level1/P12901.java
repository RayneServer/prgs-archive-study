package service.rayne.prgs.Level1;

import java.time.LocalDate;

public class P12901 {
  public String solution(int a, int b) {
    LocalDate date = LocalDate.of(2016, a, b);

    return date.getDayOfWeek().toString().substring(0, 3);
  }
}
