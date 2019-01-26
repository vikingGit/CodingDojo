package xieed.explore.bowling;

import org.junit.Assert;
import org.junit.Test;

public class BowlingScoreCaculatorTest {
  @Test
  public void should_return_7_when_7_ball_knock_down_given_one_try() throws Exception {
    BowlingScoreCaculator caculator = new BowlingScoreCaculator();
    Assert.assertEquals("7", caculator.caculateScoreInOneTurn(7, 0));
  }

  @Test
  public void should_return_9_when_4_and_5_balls_knock_down_separately_given_two_try() throws Exception {
    BowlingScoreCaculator caculator = new BowlingScoreCaculator();
    Assert.assertEquals("9", caculator.caculateScoreInOneTurn(4, 5));
  }

  @Test
  public void should_return_strike_when_first_try_knock_down_10_balls_given_one_turn() throws Exception {
    BowlingScoreCaculator caculator = new BowlingScoreCaculator();
    Assert.assertEquals("STRIKE", caculator.caculateScoreInOneTurn(10, 0));
  }
  @Test
  public void should_return_spare_when_two_tries_knock_down_10_balls_given_one_turn() throws Exception {
    BowlingScoreCaculator caculator = new BowlingScoreCaculator();
    Assert.assertEquals("SPARE", caculator.caculateScoreInOneTurn(4, 6));
  }
}
