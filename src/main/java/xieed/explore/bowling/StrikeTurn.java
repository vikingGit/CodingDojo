package xieed.explore.bowling;

import static xieed.explore.bowling.BowlingScoreCaculator.ALL_BALL_QUANTITY;

class StrikeTurn extends Turn {

  private final Try nextFirstTry;
  private final Try nextSecondTry;

  public StrikeTurn(Try nextFirstTry, Try nextSecondTry) {
   this.nextFirstTry = nextFirstTry;
   this.nextSecondTry = nextSecondTry;
  }

  int caculateScore() {
    return ALL_BALL_QUANTITY + this.nextFirstTry.getScore() + this.nextSecondTry.getScore();
  }
}
