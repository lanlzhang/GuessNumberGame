import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GenerateNumberTest {

    @Test
    public void should_be_a_four_digits_number() {
        GenerateNumber generateNumber = new GenerateNumber();
        int numberArray[] = generateNumber.generateNumberBySystem();
        assertEquals(4,numberArray.length);
    }

    @Test
    public void should_be_four_unique_digits_number() {
        GenerateNumber generateNumber = new GenerateNumber();
        int numberArray[] = generateNumber.generateNumberBySystem();
        int count = 0;
        for (int i = 0; i <numberArray.length -1 ; i++) {
            if (numberArray[i] == numberArray[i+1]){
                count ++;
            }
        }
        assertEquals(0,count);
    }
}
