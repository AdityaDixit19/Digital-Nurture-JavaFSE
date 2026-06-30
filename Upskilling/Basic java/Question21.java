class InvalidAgeException extends Exception { InvalidAgeException(String msg){super(msg);} }
public class Question21 {
    static void main() {
        int age=10;
        try{ if(age<18) throw new InvalidAgeException("Age < 18"); }
        catch(InvalidAgeException e){System.out.println(e.getMessage());}
    }
}
//Custom Exception
//Aditya Dixit
