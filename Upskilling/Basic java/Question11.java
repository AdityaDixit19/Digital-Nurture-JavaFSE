import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        if(n<1) System.out.println("invalid input");
        int  fact=1;
        for(int i=1;i<=n;i++) fact*=i;
        System.out.println(fact);
    }
}
//Factorial Calculator
//Aditya Dixit