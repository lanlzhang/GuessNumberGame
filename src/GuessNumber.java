public class GuessNumber {
    InputNumberInterface InputNumber;

    // constructor, same name as class name, no limitation for parameters and statement, and has no return and void, when call constructor, we must use new operator
    public GuessNumber(InputNumberInterface inputNumber) {
        InputNumber = inputNumber;
    }

    public int[] guessNumberInput() {
        String input = InputNumber.inputNumber();
        if (input.length()!=4 || input.replaceAll("\\D","").length()!=4){
            System.out.println("Invalid number. You must enter 4 digits between 0-9 only.");
            return guessNumberInput();
        }
        int[] guess = new int[4];
        for (int i = 0; i < 4; i++) {
            guess[i] = Integer.parseInt(String.valueOf(input.charAt(i)));

        }
        return guess;
    }
}