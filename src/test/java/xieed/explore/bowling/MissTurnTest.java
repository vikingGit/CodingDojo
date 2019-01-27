package xieed.explore.bowling;

import org.junit.Assert;
import org.junit.Test;

public class MissTurnTest {
  @Test
  public void should_return_7_when_7_ball_knock_down_given_one_try() throws Exception {
    MissTurn turn = new MissTurn(new Try(7), new Try(0));
    Assert.assertSame(7, turn.caculateScore());
  }

  @Test
  public void should_return_9_when_4_and_5_balls_knock_down_separately_given_two_try() throws Exception {
    MissTurn turn = new MissTurn(new Try(4), new Try(5));
    Assert.assertSame(9, turn.caculateScore());
  }
}