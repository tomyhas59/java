package 익명클래스;
import store.*;
public class Main {
    public static void main(String[] args) {
        Menu[] menus={
                new Menu("아메리카노",4000),
                new Menu("카푸치노",2000),
                new Menu("아이스티",3000,"real"),
        };

        StarbucksDT chain1= new StarbucksDT("구디",menus);
        chain1.intro();

        //익명 클래스
        Starbucks chain2= new Starbucks("판교",menus){
            @Override
            public  void takeOrder(){
                endEvent();
                System.out.printf("%s점 이벤트 진행 중", super.intro() );
            }

            public  void endEvent(){
                System.out.println("이벤트 종료");
            }
        };
        chain2.takeOrder();
       //ch2.endEvent(); 익명 클래스에서 선언한 함수는 외부에서 사용 불가

    }
}
