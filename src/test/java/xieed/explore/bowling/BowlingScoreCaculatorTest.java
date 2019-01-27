package xieed.explore.bowling;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class BowlingScoreCaculatorTest {
  @Test
  public void should_return_7_when_7_ball_knock_down_given_one_try() throws Exception {
    BowlingScoreCaculator caculator = new BowlingScoreCaculator();
    Assert.assertSame(7, caculator.createTurn(new Try(7), new Try(0)).caculateScore());
  }

  @Test
  public void should_return_9_when_4_and_5_balls_knock_down_separately_given_two_try() throws Exception {
    BowlingScoreCaculator caculator = new BowlingScoreCaculator();
    Assert.assertSame(9, caculator.createTurn(new Try(4), new Try(5)).caculateScore());
  }

  @Test
  public void should_return_strike_when_first_try_knock_down_10_balls_given_one_turn() throws Exception {
    BowlingScoreCaculator caculator = new BowlingScoreCaculator();
    assertThat(caculator.createTurn(new Try(10), new Try(0)), instanceOf(StrikeTurn.class));
  }

  @Test
  public void should_return_spare_when_two_tries_knock_down_10_balls_given_one_turn() throws Exception {
    BowlingScoreCaculator caculator = new BowlingScoreCaculator();
    assertThat(caculator.createTurn(new Try(4), new Try(6)), instanceOf(SpareTurn.class));
  }
}
