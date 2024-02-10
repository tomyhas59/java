package 인터페이스;

public class Main {
    public static void main(String[] args) {

        Bear bear=new Bear();
        Bird bird=new Bird();

        Hunter.start();
        bear.find();
        bear.hunt();
        bird.fly();
    }
}
