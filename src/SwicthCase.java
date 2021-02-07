import java.sql.SQLOutput;

public class SwicthCase {
    public static void main(String[] args) {
        //Its Unlike if-then and if-then-else statements, the switch
        // statement can have a number of possible execution paths. A switch works with the byte, short, char,
        // and int primitive data types
        //The following code example, SwitchCase, declares an int named month whose value represents a month.
        // The code displays the name of the month, based on the value of month, using the switch statement.
        int month = 9;
        String monthString;
        switch (month) {
            case 1:
                monthString = "January"; //The body of a switch statement is known as a switch block.
                break;
            case 2:
                monthString = "February";  //the switch statement evaluates its expression,
                // then executes all statements that follow the matching case label.
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        System.out.println(monthString); // A statement in the switch block can be labeled with one or
        // more case or default labels
        //You could also display the name of the month with if-then-else statements


        int monthNumber = 11;
        if (monthNumber == 1) {
            System.out.println("January");
        } else if (monthNumber == 2) {
            System.out.println("February");
        }else if(monthNumber== 3) {
            System.out.println("march");
        }else if (monthNumber == 4){
            System.out.println("april");
        }else if (monthNumber == 5) {
            System.out.println("may");
        }else if (monthNumber == 6) {
            System.out.println("june");
        }else if (monthNumber == 7) {
            System.out.println("july");
        }else if (monthNumber == 8) {
            System.out.println("august");
        }else if (monthNumber== 9) {
            System.out.println("september");
        }else if(monthNumber == 10) {
            System.out.println("october");
        }else if (monthNumber == 11) {
            System.out.println("november");
        }else if (monthNumber == 12){
            System.out.println( "december");



        }


    }
}
