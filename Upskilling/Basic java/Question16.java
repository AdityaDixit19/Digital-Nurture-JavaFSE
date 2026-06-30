import java.util.Scanner;

public class Question16 {
    static void main() {

            String s=new Scanner(System.in).nextLine().replaceAll("[^a-zA-Z0-9]","").toLowerCase();
            String rev=new StringBuilder(s).reverse().toString();
            System.out.println(s.equals(rev)?"Palindrome":"Not Palindrome");//nitin

    }
}
//Palindrome Checker
//Aditya Dixit