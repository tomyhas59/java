package store;

public class Menu {
    String name;
    int price;
    String cook="blend";

    //메소드 오버로딩
    public Menu(String  name, int price){
        this.name=name;
        this.price=price;
    }

    public Menu(String  name, int price, String cook){
        this.name=name;
        this.price=price;
        this.cook=cook;
    }
}
