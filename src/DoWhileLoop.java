public class DoWhileLoop {
    //the do/while loop is a variant of the while loop,this loop will execute the code block once
    //before checking the condition is true then it will repeat the loop as long as the condition is true
    // do-While loop is used to iterate a part of the program several times
    //so do- while loop is executed at least once because condition is checked after loop body
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);


        //******************************************************************
        int arr[] = {2, 11, 45, 9};
        //j starts with 0 as array index starts with 0
        int j = 0;
        do {
            System.out.println(arr[j]);
            System.out.println("***********");
            j++;
        } while (j < 4);

        }
    }
