import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstInput = sc.nextInt();
        System.out.println("Enter second number");
        int secondInput = sc.nextInt();
        System.out.println("Enter desired operation you want to perform");
        String operation = sc.next();
        switch(operation) {
            case"+":
                System.out.println(firstInput + secondInput);
                break;
            case "-":
                System.out.println(firstInput - secondInput);
                break;
            case "*":
                System.out.println(firstInput * secondInput);
                break;
            case  "/":
                System.out.println(firstInput / secondInput);
        }
    }
}
//. Simple Calculator
//Aditya Dixit
