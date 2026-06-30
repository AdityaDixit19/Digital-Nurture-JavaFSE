import java.io.*;
import java.util.Scanner;

public class Question22 {
    static void main() throws Exception{
        Scanner input = new Scanner(System.in);
        String s=input.nextLine();
        FileWriter fw=new FileWriter("output.txt");
        fw.write(s); fw.close();
        System.out.println("Written");
    }
}
//File Writing
//Aditya Dixit
