package 접근제어자;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone=new SmartPhone();
        String pb= phone.powerButton;
        String ss= phone.sdCardSlot;
        //String cp= phone.cpu;  private 접근 불가
    }
}
