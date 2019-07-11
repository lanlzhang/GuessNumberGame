public class VerifyB {
    public int caculatorB(int Actual[], int Expected[]) {
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (Actual[i] == Expected[j]){
                    counter ++;
                }

            }

        }
        return counter;

    }
}
