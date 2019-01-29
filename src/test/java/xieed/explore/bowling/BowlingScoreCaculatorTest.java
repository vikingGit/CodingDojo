package xieed.explore.bowling;

import org.junit.Assert;
import org.junit.Test;

public class BowlingScoreCaculatorTest {
  @Test
  public void should_return_210_when_all_scores_are_10_given_7_turns() throws Exception {
    BowlingScoreCaculator caculator = new BowlingScoreCaculator();

    Assert.assertEquals(210, caculator.bowlingScore(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10}));
  }

  @Test
  public void should_return_148_when_mix_all_kind_of_turns_are_10_given_10_turns() throws Exception {
    BowlingScoreCaculator caculator = new BowlingScoreCaculator();

    Assert.assertEquals(148, caculator.bowlingScore(new int[]{9, 1, 10, 5, 4, 10, 6, 4, 8, 2, 6, 3, 10, 4, 5, 8, 1}));
  }
}
