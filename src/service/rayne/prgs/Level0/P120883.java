package service.rayne.prgs.Level0;

public class P120883 {
  public String solution(String[] id_pw, String[][] db) {
    for (String[] data : db) {
      if (!data[0].equals(id_pw[0])) continue;
      else if (!data[1].equals(id_pw[1])) return "wrong pw";
      else return "login";
    }

    return "fail";
  }
}
