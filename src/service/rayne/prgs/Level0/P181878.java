package service.rayne.prgs.Level0;

public class P181878 {
  public int solution(String myString, String pat) {
    return myString.toLowerCase().contains(pat.toLowerCase())? 1 : 0;
  }
}
