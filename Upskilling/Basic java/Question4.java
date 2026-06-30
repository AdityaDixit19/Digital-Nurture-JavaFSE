import java.util.Scanner;

public class Question4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your year:");
        int n=sc.nextInt();
        if((n%4==0 && n%100!=0)||(n%400==0)){
                System.out.println("leap year");
        }
        else{
                System.out.println("not leap year");
        }
    }
}
// Leap Year Checker
//Aditya Dixit