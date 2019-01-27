package xieed.explore.bowling;

class MissTurn extends Turn{
  private Try firstTry;
  private Try secondTry;

  MissTurn(Try firstTry, Try secondTry) {
    this.firstTry = firstTry;
    this.secondTry = secondTry;
  }

  int caculateScore() {
    return this.firstTry.getScore() + this.secondTry.getScore();
  }
}
