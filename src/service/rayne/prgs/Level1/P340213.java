package service.rayne.prgs.Level1;

public class P340213 {
  public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
    int vidLen = calcTime(video_len);
    int posInt = calcTime(pos);
    int startInt = calcTime(op_start);
    int endInt = calcTime(op_end);

    if (posInt > startInt && posInt < endInt) posInt = endInt;
    for (String command : commands) {
      if (command.equals("prev")) {
        posInt -= 10;
        if (posInt < 0) posInt = 0;
      } else {
        posInt += 10;
        if (posInt > vidLen) posInt = vidLen;
      }

      if (posInt >= startInt && posInt <= endInt) posInt = endInt;
    }

    return String.format("%02d:%02d", posInt / 60, posInt % 60);
  }

  private int calcTime(String str) {
    String[] strArr = str.split(":");
    return (Integer.parseInt(strArr[0]) * 60) + Integer.parseInt(strArr[1]);
  }
}
