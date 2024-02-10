package 인터페이스;

public interface Hunter {
    String position="포식자";

    static void start(){
        System.out.println("먹이 물색");
    } //인터페이스 자체 메소드 Hunter.start()로 실행

    default void find(){
        System.out.println("먹이 발견");
    } // 기본 메소드 자식들이 실행 가능

    void hunt(); //추상 메소드로서 자식 클래스에서 구현해야 함

}
