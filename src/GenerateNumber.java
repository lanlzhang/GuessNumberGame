import java.util.Random;

public class GenerateNumber {
    public int[] generateNumberBySystem() {
        Random rand = new Random();
        int[] randArray = {10,10,10,10};

        for (int i = 0; i < randArray.length ; i++) {
            int temp = rand.nextInt(9);
            while (temp == randArray[0] || temp == randArray[1] || temp == randArray[2] || temp == randArray[3]){
                temp = rand.nextInt(9);
            }
            randArray[i] = temp;
        }
        return randArray;

    }
}