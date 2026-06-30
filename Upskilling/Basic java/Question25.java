import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
public class Question25 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Aditya");
        map.put(102, "Dixit");
        map.put(103, "Cognizant");
        // Display all entries
        System.out.println("Student Records:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }
        System.out.print("Enter student ID to search: ");
        int id = sc.nextInt();
        if (map.containsKey(id)) {
            System.out.println("Student Name: " + map.get(id));
        } else {
            System.out.println("ID not found.");
        }
    }
}
//HashMap Example
//Aditya Dixit