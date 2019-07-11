public class VerifyA {

    public int caculatorA(int actual[], int expected[]) {
        int countA = 0;
        for (int i = 0; i < 4; i++) {
           if (actual[i] == expected[i]){
               countA++;
           }

        }
        return countA;
    }
}
