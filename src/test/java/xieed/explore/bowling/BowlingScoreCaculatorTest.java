package xieed.explore.bowling;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BowlingScoreCaculatorTest {
  @Test
  public void should_return_strike_when_first_try_knock_down_10_balls_given_one_turn() throws Exception {
    BowlingScoreCaculator caculator = new BowlingScoreCaculator();
    assertThat(caculator.createTurn(new Try(10), new Try(0), null, null), instanceOf(StrikeTurn.class));
  }

  @Test
  public void should_return_spare_when_two_tries_knock_down_10_balls_given_one_turn() throws Exception {
    BowlingScoreCaculator caculator = new BowlingScoreCaculator();
    assertThat(caculator.createTurn(new Try(4), new Try(6), null, null), instanceOf(SpareTurn.class));
  }

  @Test
  public void should_return_miss_when_two_tries_knock_down_less_than_10_balls_given_one_turn() throws Exception {
    BowlingScoreCaculator caculator = new BowlingScoreCaculator();
    assertThat(caculator.createTurn(new Try(4), new Try(5), null, null), instanceOf(MissTurn.class));
  }

}
