package store;

public class Starbucks {
//인스턴스가 가질 필드를

    protected static int lastNo=0; //protected 상속 접근

    protected int no = ++lastNo;

    String name;
    Menu[] menus;

    static String  brand="스타벅스";

    static  String  contact(){
        return  "%s입니다, 무엇을 도와드릴까요?".formatted(brand);
    }



//생성자: 인스턴스를 만드는 메소드

    Starbucks (String name, Menu[] menus){
        this.name=name;
        this.menus=menus;
}

    Menu orderMenu (String name) {
        for (Menu menu : menus) {
            if (menu.name.equals(name)) {
                return menu;
            }
        }
        return  null;
    }

//인스턴스가 가질 메소드
    String intro(){
    String name="명동";
        System.out.println("안녕하세요!");
        return "%s %d호 %s점입니다".formatted(brand, no,this.name);
    }

    void changeAddress(String address) {
        this.name = address;
    }

}

