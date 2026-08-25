package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P181851 {
  private class Player implements Comparable<Player> {
    Integer number;
    Integer rank;
    Boolean attendance;

    Player(int number, int rank, boolean attendance) {
      this.number = number;
      this.rank = rank;
      this.attendance = attendance;
    }

    public int compareTo(Player player) {
      return Integer.compare(rank, player.rank);
    }
  }

  public int solution(int[] rank, boolean[] attendance) {
    List<Player> playerList = new ArrayList<>();
    for (int i = 0; i < rank.length; i++) {
      playerList.add(new Player(i, rank[i], attendance[i]));
    }

    playerList.sort(Comparator.naturalOrder());
    int[] pointArr = new int[3];
    int idx = 0;
    int pointer = 0;

    while (pointer < 3) {
      Player player = playerList.get(idx++);
      if (!player.attendance) continue;

      pointArr[pointer++] = player.number;
    }

    return (10000 * pointArr[0]) + (100 * pointArr[1]) + pointArr[2];
  }
}
