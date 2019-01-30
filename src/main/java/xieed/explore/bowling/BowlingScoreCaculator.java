package xieed.explore.bowling;

import java.util.List;

class BowlingScoreCaculator {

  final static int ALL_BALL_QUANTITY = 10;

  int bowlingScore(int[] scores) {
    List<Turn> turns = BowlingTurnCreator.createTurns(scores);
    int sum = 0;
    for (Turn turn : turns) {
      sum += turn.calculateScore();
    }
    return sum;
  }
}
