public class Question19 {
    interface Playable {
        void play();
    }
    class Guitar implements Playable {
        public void play(){
            System.out.println("Strum");
        }
    }
    class Piano implements Playable {
        public void play(){
            System.out.println("Keys");
        }
    }
}
//Interface Implementation
//Aditya Dixit