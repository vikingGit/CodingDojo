package xieed.explore.bowling;

class BowlingScoreCaculator {

  private final static int ALL_BALL_QUANTITY = 10;

  Turn createTurn(Try firstTry, Try secondTry) {
    if(firstTry.getScore() == ALL_BALL_QUANTITY){
      return new StrikeTurn();
    }
    if((firstTry.getScore() + secondTry.getScore()) == ALL_BALL_QUANTITY){
      return new SpareTurn();
    }
    return new MissTurn(firstTry, secondTry);
  }
}
