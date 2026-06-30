public class Question17 {
    String make, model; int year;

    void Question17(String s, String s1, int y){make=s;model=s1;year=y;}
    void displayDetails(){System.out.println(make+" "+model+" "+year);}
    public static void main(String[] args){
        Question17 c=new Question17(); c.displayDetails();
    }
}
//Class and Object Creation
//Aditya Dixit