public class ForLoop {
    public static void main(String[] args) {
        //Loop is allowing us to Execute a statement or group of statements multiple times.
        // condition is true, if not true then it will exit from loop
        // For Loop :
        // While Loop
        // Do..While loop
        // For Each Loo
        for (int y = 0; y < 10; y++) {
            System.out.println("I LOVE JAVA");
            // 0 +1  1+1 2+1 3 +1  4+1 5+1  6+1 7+1 8+1 9+1
            /// 1      2   3   4    5    6    7   8   9   10
///////////////////////////////////////////////////////////////////////
// If the number of iteration is fixed, it is recommended to use for loop.
            //We can initialize the variable,
            //  check condition and increment/decrement value
            //loop of i
            for (int i = 1; i <= 3; i++) {
                //loop of j
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + "" + j);
                // }//end of i
                //end of j
                //*******************************************************************************
                //The for statement has another form designed for iteration like Collections
                // and arrays This form called  enhanced for statement, and can be used to make your loops
                //  easy to read.
                int[] numbers =
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                for (int item : numbers) {
                    System.out.println("Count is: " + item);
                //******************************************************************************





                    }
            }
            }
        }
    }
}