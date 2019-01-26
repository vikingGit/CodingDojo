package xieed.explore.bowling;

class BowlingScoreCaculator {

  private final static int ALL_BALL_QUANTITY = 10;

  String caculateScoreInOneTurn(int firstTryBalls, int secondTryBalls) {
    if(firstTryBalls == ALL_BALL_QUANTITY){
      return "STRIKE";
    }
    if((firstTryBalls + secondTryBalls) == ALL_BALL_QUANTITY){
      return "SPARE";
    }
    return String.valueOf(firstTryBalls + secondTryBalls);
  }
}
