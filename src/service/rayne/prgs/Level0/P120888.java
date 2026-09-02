package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class P120888 {
  public String solution(String my_string) {
    List<String> strList = new ArrayList<>(new LinkedHashSet<>(Arrays.asList(my_string.split(""))));

    return String.join("", strList);
  }
}
