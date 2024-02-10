package 인터페이스;

public class Bird implements Hunter,Flyer {
    public void hunt(){
        System.out.println("사냥");

    }
    public void fly(){
        System.out.println("날갯짓");
    }
}
