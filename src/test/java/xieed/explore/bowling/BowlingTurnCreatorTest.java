package xieed.explore.bowling;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.List;
import org.junit.Test;

public class BowlingTurnCreatorTest {
  @Test
  public void should_return_strike_when_first_try_knock_down_10_balls_given_one_turn() throws Exception {
    assertThat(BowlingTurnCreator.createTurns(new int[]{10,8,2}).get(0), instanceOf(StrikeTurn.class));
  }

  @Test
  public void should_return_spare_when_two_tries_knock_down_10_balls_given_one_turn() throws Exception {
    assertThat(BowlingTurnCreator.createTurns(new int[]{4,6,8}).get(0), instanceOf(SpareTurn.class));
  }

  @Test
  public void should_return_miss_when_two_tries_knock_down_less_than_10_balls_given_one_turn() throws Exception {
    assertThat(BowlingTurnCreator.createTurns(new int[]{4,5}).get(0), instanceOf(MissTurn.class));
  }

  @Test
  public void should_return_correct_turns_when_scores_are_10_8_2_9_0_given_multiple_turns() throws Exception {
    List<Turn> turns = BowlingTurnCreator.createTurns(new int[]{10, 8, 2, 9, 0});

    assertEquals(3, turns.size());
    assertThat(turns.get(0), instanceOf(StrikeTurn.class));
    assertThat(turns.get(1), instanceOf(SpareTurn.class));
    assertThat(turns.get(2), instanceOf(MissTurn.class));
  }

  @Test
  public void should_return_correct_turns_when_scores_are_9_1_10_9_1_8_given_multiple_turns() throws Exception {
    List<Turn> turns = BowlingTurnCreator.createTurns(new int[]{9, 1, 10, 9, 1, 8});

    assertEquals(3, turns.size());
    assertThat(turns.get(0), instanceOf(SpareTurn.class));
    assertThat(turns.get(1), instanceOf(StrikeTurn.class));
    assertThat(turns.get(2), instanceOf(SpareTurn.class));
  }

  @Test
  public void should_return_correct_turns_when_scores_are_9_0_7_3_10_6_4given_multiple_turns() throws Exception {
    List<Turn> turns = BowlingTurnCreator.createTurns(new int[]{9, 0, 7, 3, 10, 6, 4});

    assertEquals(3, turns.size());
    assertThat(turns.get(0), instanceOf(MissTurn.class));
    assertThat(turns.get(1), instanceOf(SpareTurn.class));
    assertThat(turns.get(2), instanceOf(StrikeTurn.class));
  }
}