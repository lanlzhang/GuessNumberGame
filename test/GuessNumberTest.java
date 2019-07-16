import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuessNumberTest {

    @Test
    public void should_be_four_digits_number() {
        InputNumberMock inputNumber = new InputNumberMock();
        inputNumber.result = "1234";
        GuessNumber guessNumber = new GuessNumber(inputNumber);
        int guessNumberArray[] = guessNumber.guessNumberInput();
        assertEquals(4,guessNumberArray.length);

    }

    @Test
    public void should_be_four_unique_digits() {
        InputNumberMock inputNumber = new InputNumberMock();
        inputNumber.result = "1234";
        GuessNumber guessNumber = new GuessNumber(inputNumber);
        int guessNumberArray[] = guessNumber.guessNumberInput();
        int count = 0;
        for (int i = 0; i < guessNumberArray.length-1; i++) {
            if (guessNumberArray[i] == guessNumberArray[i+1]){
                count++;
            }
        }
        assertEquals(0,count);
    }
}
