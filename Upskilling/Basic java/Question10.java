import java.util.Random;
import java.util.Scanner;
public class Question10{
    public static void main(String[] args) {
        int num = new Random().nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        int predict;
        do {
            predict = sc.nextInt();
            if(predict<num) System.out.println("Gussed Too low");
            else if(predict>num) System.out.println("Gussed Too high");
        } while(predict!=num);
        System.out.println("Correct!");
    }
}
//Number Guessing Game
//Aditya Dixit