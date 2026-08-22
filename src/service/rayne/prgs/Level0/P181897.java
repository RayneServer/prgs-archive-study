package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181897 {
  public int[] solution(int n, int[] slicer, int[] num_list) {
    int[] result = null;

    switch (n) {
      case 1 -> result = sliceOne(slicer, num_list);
      case 2 -> result = sliceTwo(slicer, num_list);
      case 3 -> result = sliceThree(slicer, num_list);
      case 4 -> result = sliceFour(slicer, num_list);
    }

    return result;
  }

  private int[] sliceOne(int[] slicer, int[] num_list) {
    int[] result = new int[slicer[1] + 1];
    for (int i = 0; i < result.length; i++) {
      result[i] = num_list[i];
    }

    return result;
  }

  private int[] sliceTwo(int[] slicer, int[] num_list) {
    int[] result = new int[num_list.length - slicer[0]];
    for (int i = 0; i < result.length; i++) {
      result[i] = num_list[i + slicer[0]];
    }

    return result;
  }

  private int[] sliceThree(int[] slicer, int[] num_list) {
    int[] result = new int[slicer[1] - slicer[0] + 1];
    for (int i = 0; i < result.length; i++) {
      result[i] = num_list[i + slicer[0]];
    }

    return result;
  }

  private int[] sliceFour(int[] slicer, int[] num_list) {
    List<Integer> result = new ArrayList<>();

    for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
      result.add(num_list[i]);
    }

    return result.stream().mapToInt(Integer::intValue).toArray();
  }
}
