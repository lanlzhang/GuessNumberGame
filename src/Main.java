import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("The computer has generate a unique 4 digit number.\n"
                + "You can try to guess the 4 digits number.\n");
        System.out.println("_______________________________________________________\n");
        int[] random=numberGenerator();

        int indexMatch=0;

        while(indexMatch!=3){
            int[] guess=getGuess();
            indexMatch=0;
            VerifyA countA = new VerifyA();
            int countAnumber = countA.caculatorA(guess,random);
            VerifyB countB = new VerifyB();
            int countBnumber = countB.caculatorB(guess,random);
            if(countAnumber==4 && countBnumber == 4){
                System.out.print("Well done! Your guess is Correct! The number is: ");
                for(int i=0;i<guess.length;i++){
                    System.out.println(guess[i]);
                }
            }
            else{
                    System.out.println("You guess result is: "+countAnumber+"A"+countBnumber+"B\n");
                }
            indexMatch ++;
            }
        }


    // the system generate a number with 4 unique digits
    public static int[] numberGenerator() {
        Random rand = new Random();
        int[] randArray = {10,10,10,10};

        for(int i=0;i<randArray.length;i++){
            int temp = rand.nextInt(9);
            while(temp == randArray[0] || temp == randArray[1] || temp == randArray[2] || temp == randArray[3]){
                temp=rand.nextInt(9);
            }
            randArray[i]=temp;
        }

        return randArray;
    }

    //guess the number
    public static int[] getGuess(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your guess: ");
        String input = keyboard.nextLine();
        if(input.length()!=4 || input.replaceAll("\\D","").length()!=4){
            System.out.println("Invalid number. You must enter 4 digits between 0-9 only.");
            return getGuess();
        }
        int[] guess = new int[4];
        for (int i = 0; i < 4; i++) {
            guess[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
            //Integer.parseInt- convert a string to int; String.valueOf()-return the string representative of the char argument.
        }
        return guess;
    }
}
