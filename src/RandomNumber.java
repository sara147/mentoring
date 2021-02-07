import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        //so in this class the program will generate  random numbers within the provided range
        //declare the maximum value of the range
        //by using the formula math.random()*(max - min + 1) +mi // to generate values with the min value inclusive
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int maxRange = 50;

        System.out.println("please enter maximum range :");
        maxRange = sc.nextInt();
        for (int i = 0; i < maxRange; i++) ;
        {
            for (int iCount = 1000; iCount < 5000; iCount++) ;

            System.out.println(rand.nextInt(maxRange));
        }
        System.out.println("****************************");
        int[] Lottery = new int[10];
        Random random = new Random();
        for (int i = 0; i < Lottery.length; i++) {
            Lottery[i] = random.nextInt(75);
            System.out.println(Lottery[i]);
        }
        System.out.println("*******?????????????****************");
    Integer [] stId= new Integer[10];
    Random random1 =new Random();
    for(int i=1;i<stId.length;i++){
        stId[i]= random1.nextInt(400);
        stId[i]= random1.nextInt(20);
        System.out.println(stId[i]);
    }
        System.out.println(Math.random());
        System.out.println("Ny201"+Math.random());
    }
}
