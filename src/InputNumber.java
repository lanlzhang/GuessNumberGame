import java.util.Scanner;

public class InputNumber implements InputNumberInterface {

    public String inputNumber(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your guess number:");
        String input = keyboard.nextLine();
        return input;
    }
}


