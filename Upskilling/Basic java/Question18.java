class Animal {
    void makeSound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    void makeSound(){
        System.out.println("Bark");
    }
}
public class Question18 {
    static void main() {
        new Animal().makeSound();
        new Dog().makeSound();
    }
}
//Inheritance Example
//Aditya Dixit