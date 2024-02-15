package store;


public class Main {
    public static  void main(String[] args){

        Menu[] menus={
                new Menu("아메리카노",4000),
                new Menu("카푸치노",2000),
                new Menu("아이스티",3000,"real"),
        };

        StarbucksDT chain1= new StarbucksDT("구디",menus);
        Starbucks chain2= new Starbucks("판교",menus);


        Menu order1=chain1.orderMenu("카푸치노");
        Menu order2=chain1.orderMenu("복숭아");

        chain1.takeDTOrder();
        chain2.takeOrder();

        chain1.changeAddress("목동");

       Starbucks[] stores={
               new Starbucks("강남",menus),
               new StarbucksDT("서초",menus),
       };
       for(Starbucks store:stores){
           if(store instanceof  StarbucksDT){
               //자식 클래스의 기능 사용하려면 명시적 타입 변환((StarbucksDT) store)
               ((StarbucksDT) store).takeDTOrder();
           } else  store.intro();
       }
        //static
        Starbucks.SttGift sttGift=new Starbucks.SttGift();
        sttGift.func();

        //일반 인스턴스 내부 클래스 : getter로 반환
        Starbucks.Gift gift= chain1.getGift();
        gift.func();
    }
}
