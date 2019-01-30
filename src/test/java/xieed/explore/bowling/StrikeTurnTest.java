package xieed.explore.bowling;

import org.junit.Assert;
import org.junit.Test;

public class StrikeTurnTest {

  @Test
  public void should_return_20_when_next_two_tries_knocked_down_8_and_2_balls_separately_given_strike_turn() throws Exception {
    StrikeTurn turn = new StrikeTurn(new Try(8), new Try(2));
    Assert.assertEquals(20, turn.calculateScore());
  }
}