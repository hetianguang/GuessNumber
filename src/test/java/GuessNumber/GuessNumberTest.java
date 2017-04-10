package GuessNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tghe on 4/10/17.
 */
public class GuessNumberTest {
    @Test
    public void should_return_compare_result_when_input_a_number_and_pick() {

        GuessNumber guessNumber = new GuessNumber();

        assertEquals(guessNumber.compareNumber(3,4),"big");
        assertEquals(guessNumber.compareNumber(3,2),"small");
        assertEquals(guessNumber.compareNumber(3,3),"true");
    }
}