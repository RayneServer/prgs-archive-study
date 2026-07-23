package service.rayne.prgs.Level0;

public class P181932 {
  public String solution(String code) {
    boolean mode = false;
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < code.length(); i++) {
      char codePiece = code.charAt(i);

      if (mode) {
        if (codePiece == '1') mode = false;
        else if (i % 2 == 1) stringBuilder.append(codePiece);
      } else {
        if (codePiece == '1') mode = true;
        else if (i % 2 == 0) stringBuilder.append(codePiece);
      }
    }

    return stringBuilder.length() != 0 ? stringBuilder.toString() : "EMPTY";
  }
}
