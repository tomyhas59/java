package store;

public class Chain1 {
    public static  void main(String[] args){

        Menu[] menus={
                new Menu("아메리카노",4000),
                new Menu("카푸치노",2000),
                new Menu("아이스티",3000,"real"),
        };

        Starbucks chain1= new Starbucks("구디",menus);
        Starbucks chain2= new Starbucks("판교",menus);


        Menu order1=chain1.orderMenu("카푸치노");
        Menu order2=chain1.orderMenu("복숭아");

        chain2.intro(); //안녕하세요 본점입니다

        chain1.changeAddress("목동");

        StarbucksDT chainDT=new StarbucksDT("가산", menus);

        chainDT.takeDTOrder(); //가산점 드라이브스루 주문 받음

        chainDT.setDriveThruOpen((false));
        chainDT.takeDTOrder(); //가산점 드라이브스루 주문 불가

    }
}
