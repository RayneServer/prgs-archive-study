package service.rayne.prgs.Level1;

public class P250137 {
  public int solution(int[] bandage, int health, int[][] attacks) {
    int lastAttack = attacks[attacks.length - 1][0];
    int[] timeLine = new int[lastAttack + 1];
    for (int[] attack : attacks) {
      timeLine[attack[0]] = attack[1];
    }

    int combo = 0;
    int hp = health;
    for (int i = 1; i < timeLine.length; i++) {
      if (timeLine[i] > 0) {
        combo = 0;
        hp -= timeLine[i];
        if (hp <= 0) return -1;
      } else {
        hp += bandage[1];
        combo++;
        if (combo == bandage[0]) {
          hp += bandage[2];
          combo = 0;
        }
        if (hp > health) hp = health;
      }
    }

    return hp;
  }
}
