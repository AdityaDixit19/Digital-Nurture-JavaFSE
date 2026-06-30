import java.io.BufferedReader;
import java.io.FileReader;

public class Question23 {
    static void main()throws Exception {
        BufferedReader br=new BufferedReader(new FileReader("output.txt"));
        String line; while((line=br.readLine())!=null) System.out.println(line);
        br.close();
    }
}
//file reading
//Aditya Dixit
