import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
       // Else if means another If or adding more condition
        int  score;    // To hold a test score
        char grade;    // To hold a letter grade

        // Create a Scanner object to read input.
        Scanner sc= new Scanner(System.in);
        // Get the test score.
        System.out.print("Enter the  numeric test score : ");
        score = sc.nextInt();

        // Calculate the grade.
        if (score >= 90)
        {
            grade = 'A';
        }
        else if (score >= 80)
        {
            grade = 'B';
        }
        else if (score >= 70)
        {
            grade = 'C';
        }
        else if (score >= 50)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }

        // Display the grade.
        System.out.println("Your grade is " + grade);

        /////////////////////////////string///////////////////////
        // a string value will be taken as input from the user.
        // The first ‘if’ condition will check the input value,
        // and if it returns false, then the value will check by the next
        // ‘if’ condition and so on. The message of the else part will print if all
        // ‘if’ conditions return false.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");

        // Take string data from the user
        String name = in.next();

        // Check the input value equal to 'Kate ' or not
        if(name.equals("Kate"))
        {
            System.out.print("You have achieved the first price");
        }
        // Check the input value equal to 'Maria' or not
        else if(name.equals("Maria"))
        {
            System.out.print("You have achieved the second price");
        }
        // Check the input value equal to 'John' or not
        else if(name.equals("John"))
        {
            System.out.print("You have achieved the third price");
        }
        else {
            System.out.print("Try for next time");
        }
    }
}
