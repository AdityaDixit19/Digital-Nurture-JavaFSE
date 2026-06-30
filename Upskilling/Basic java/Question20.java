import java.util.Scanner;

public class Question20 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
//try catch example
//Aditya Dixit