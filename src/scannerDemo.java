import java.util.Scanner;

public class scannerDemo {

    public static void main(String[] args) {
        //the Scanner class is used to get user input, and it is found in the java.util package.
        //To use the Scanner class, create an object of the class and use any of the available methods
        // use the nextLine() method, nextBoolean(),nextByte(),nextDouble(),nextFloat(),nextInt(),nextLong();..


        // I declare the object and I initialize with standard input object
        Scanner sc = new Scanner(System.in);
        //String input
        String name = sc.nextLine();
        //lets say if its for a char the input  will be this way
        char gender = sc.next().charAt(0);
        // for numerical data input like byte, short,and float example like
        int age = sc.nextInt();
        long studentId =sc.nextLong();
        double Gpa = sc.nextDouble();
        //the I print the value to  check if the input was correctely obtained
        System.out.println("name :"+ name);
        System.out.println("Gender: "+ gender);
        System.out.println("Age :" + age);
        System.out.println("studentId :" + studentId);
        System.out.println("Student Gpa:" + Gpa);
        //run the class and insert the input in the console

        //to close Scanner
        //input.Close();





    }
}
