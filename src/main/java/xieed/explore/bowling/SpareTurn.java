package xieed.explore.bowling;

import static xieed.explore.bowling.BowlingScoreCaculator.ALL_BALL_QUANTITY;

class SpareTurn extends Turn {

  private Try nextTry;

  SpareTurn(Try nextTry) {
    this.nextTry = nextTry;
  }

  int caculateScore() {
    return ALL_BALL_QUANTITY + this.nextTry.getScore();
  }
}
