package xieed.explore.bowling;

import static xieed.explore.bowling.BowlingScoreCaculator.ALL_BALL_QUANTITY;

import java.util.ArrayList;
import java.util.List;

public class BowlingTurnCreator {

  static Turn createTurn(Try firstTry, Try secondTry, Try nextFirstTry, Try nextSecondTry) {
    if(firstTry.getScore() == ALL_BALL_QUANTITY){
      return new StrikeTurn(nextFirstTry, nextSecondTry);
    }
    if((firstTry.getScore() + secondTry.getScore()) == ALL_BALL_QUANTITY){
      return new SpareTurn(firstTry, secondTry, nextFirstTry);
    }
    return new MissTurn(firstTry, secondTry);
  }

  static List<Turn> createTurns(int[] scores) {
    ArrayList<Turn> turns = new ArrayList<Turn>();
    int i = 0;
    while (true) {
      if (scores[i] == ALL_BALL_QUANTITY) {
        turns.add(new StrikeTurn(new Try(scores[i + 1]), new Try(scores[i + 2])));
        if (i == scores.length - 3) {
          break;
        }
        i++;
      } else if ((scores[i] + scores[i + 1]) == ALL_BALL_QUANTITY) {
        turns.add(new SpareTurn(new Try(scores[i]), new Try(scores[i + 1]), new Try(scores[i + 2])));
        if (i == scores.length - 3) {
          break;
        }
        i = i + 2;
      } else {
        turns.add(new MissTurn(new Try(scores[i]), new Try(scores[i + 1])));
        if (i == scores.length - 2) {
          break;
        }
        i = i + 2;
      }
    }
    return turns;
  }
}
