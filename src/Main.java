import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // generate a number randomly by system
        System.out.println("The computer has generate a unique 4 digit number.\n"
                + "You can try to guess the 4 digits number.\n");
        GenerateNumber generateNumber = new GenerateNumber();
        int[] random=generateNumber.generateNumberBySystem();

        int indexMatch=0;
        while(indexMatch!=1){

            // input a guess number
            InputNumber inputNunber = new InputNumber();
            GuessNumber guessNumber = new GuessNumber(inputNunber);
            int[] guess=guessNumber.guessNumberInput();

            indexMatch=0;

            // verify the guess number comparing with the random number
            VerifyA countA = new VerifyA();
            int countAnumber = countA.caculatorA(guess,random);
            VerifyB countB = new VerifyB();
            int countBnumber = countB.caculatorB(guess,random);

            //input the comparing result
            if(countAnumber==4 && countBnumber == 4){
                System.out.print("Well done! Your guess is Correct! The number is: ");
                for(int i=0;i<guess.length;i++){
                    System.out.print(guess[i]);
                }
                indexMatch = 1;

            }
            else{
                    System.out.println("You guess result is: "+countAnumber+"A"+countBnumber+"B\n");
                }
            }
        }

}
