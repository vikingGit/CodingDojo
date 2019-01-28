package xieed.explore.bowling;

import static xieed.explore.bowling.BowlingScoreCaculator.ALL_BALL_QUANTITY;

class SpareTurn extends Turn {

  private final Try firstTry;
  private final Try secondTry;
  private Try nextTry;

  public SpareTurn(Try firstTry, Try secondTry, Try nextTry) {
    this.firstTry = firstTry;
    this.secondTry = secondTry;
    this.nextTry = nextTry;
  }

  int caculateScore() {
    return ALL_BALL_QUANTITY + this.nextTry.getScore();
  }
}
