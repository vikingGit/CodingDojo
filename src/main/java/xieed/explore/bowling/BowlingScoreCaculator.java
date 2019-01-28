package xieed.explore.bowling;

class BowlingScoreCaculator {

  public final static int ALL_BALL_QUANTITY = 10;

  Turn createTurn(Try firstTry, Try secondTry, Try nextFirstTry, Try nextSecondTry) {
    if(firstTry.getScore() == ALL_BALL_QUANTITY){
      return new StrikeTurn(firstTry, secondTry);
    }
    if((firstTry.getScore() + secondTry.getScore()) == ALL_BALL_QUANTITY){
      return new SpareTurn(firstTry, secondTry, nextFirstTry);
    }
    return new MissTurn(firstTry, secondTry);
  }
}
