import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
//Use if to specify a block of code to be executed, if a specified condition is true
//Use else to specify a block of code to be executed, if the same condition is false
//Use else if to specify a new condition to test, if the first condition is false
//Use switch to select one of many blocks of code to be executed
        int num = 120;
        if (num < 50) {
            System.out.println("num is less than 50");
        } else {
            System.out.println("num is greater than or equal 50");

            ///////////////////////////////// /////////////////////////

            //an integer value is taken from the user. If the input value is between 13 to 17,
            // then ‘if’ condition will return true
            // Create a Scanner object
            Scanner input = new Scanner(System.in);

            System.out.print("Type your age : ");

            // Take numeric data from the user
            int age = input.nextInt();

            // Check the input value is within the range 13-17 or not
            if (age >= 13 && age < 18) {
                System.out.print("You are a teenager");
            } else {
                System.out.print("You are not a teenager");
            }
            ///////////////////////////boolean type condition////////////////////////////
            boolean isTodaySunny = false;

            if (isTodaySunny) {
                System.out.println("lets go fishing");
            } else {
                System.out.println("we will watch NetFlex");

            }

        }
    }
}