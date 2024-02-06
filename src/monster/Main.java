package monster;

public class Main {
    public static void main(String[] args) {

        Slime black=new Slime();
        Slime white=new Slime();

        black.attack(white);

        System.out.println(white.hp); //145
    }
}
