package brand;

public class Chain1 {
    public static  void main(String[] args){

        Menu[] menus={
                new Menu("아메리카노",4000),
                new Menu("카푸치노",2000),
                new Menu("아이스티",3000,"real"),
        };

        Starbucks chian1= new Starbucks(2,"구디",menus);
        Starbucks chain2= new Starbucks(3,"판교",menus);

        Menu order1=chian1.orderMenu("카푸치노");
        Menu order2=chian1.orderMenu("복숭아");


        String intro= chain2.intro();
    }
}
