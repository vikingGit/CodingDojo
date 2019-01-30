package xieed.explore.bowling;

import org.junit.Assert;
import org.junit.Test;

public class SpareTurnTest {

  @Test
  public void should_return_18_score_when_next_try_knock_down_8_balls_given_spare_turn() throws Exception {
    SpareTurn turn = new SpareTurn(new Try(8));
    Assert.assertEquals(18, turn.caculateScore());
  }
}