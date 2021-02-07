public class OperatorsArethmeticCond {
    ////Arithmetic operators are used in mathematical
    // expressions in the same way that they are used in algebra.
    // (+) (-) (x) (/) (%)



    // ********  EqualityAndRelationalOperators  ***********
    // == Equal to
    // != not Equal
    // > Grater than
    // >= Grater than Equal
    // < Less than
    // <= Less than Equal
    // % Returns the division remainder  	x % y
    //++ increment and -- decrement
    // += adds a value to a variable (addition assignment)
    // declare variables

    public static void main(String[] args) {
        //   || -> or
        int a = 5;

        if (a == 5 || a > 6) {
            System.out.println(a);
        }

        // && -> and
        if (a == 5 && a > 4) {
            System.out.println("to day is the day " + a);
        }

        // != -> not equals

        if (a != 4) {
            System.out.println("a is not equals to 4. a is : " + a);
        }
        // == -> equals

        if (a == 5) {
            System.out.println("today a matched : " + a);
        }


//*************************************************


        /////////////////////////Calculations ///////////////////////////////
        int num1 = 70;
        int num2 = 3;
        int total = num1 + num2;
        int balance = num1 - num2;
        int monthlyValue = num1 * num2;
        int weeklyValue = num1 / num2;
        int value = num1 % num1;

        System.out.println("Total : " + total);
        System.out.println("Balance : " + balance);
        System.out.println("Month Value : " + monthlyValue);
        System.out.println("Week lValue : " + weeklyValue);
        System.out.println("reminder Value : " + value);

        //////////////////////conditional//////////////////////////////////////////////////////

        int val1 = 50;
        int val2 = 60;
        if (val1 == val2) {
            // if condition is false then it will not execute if block of code
            System.out.println(" value 1 is smaller than value 2");
        }

        if (val1 == 50 && val2 == 60) {
            System.out.println("comparing two values");
        }
        if (val1 == 55 || val2 == 60) {
            System.out.println("comparing two values using OR Operator");
        }
    }
}
