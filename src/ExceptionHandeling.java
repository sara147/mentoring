public class ExceptionHandeling {
    public static void main(String[] args) {
       try {
           int num1 = 30, num2 = 0;
           int output = num1 / num2;
           System.out.println("Result: " + output);
       }catch(ArithmeticException E) {
           System.out.println("num1 can't divide by num2");
       }finally {
       }





    }



}




