package store;

public enum CoffeeMenu {
    AM("아메리카노",3000),
    CA("카푸치노",3200),
    TEA("아이스티",3500);


    private String name;
    private int pirce;

    CoffeeMenu(String  name, int price){
        this.name=name;
        this.pirce=price;
    }

    public  String   getName() {return name;}
    public  int getPirce(){ return pirce;}

    public  void  setPirce(int price){
        this.pirce=price;
    }
}
