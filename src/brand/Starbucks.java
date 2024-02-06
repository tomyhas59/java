package brand;

public class Starbucks {
//인스턴스가 가질 필드를
    int no;
    String name;

    Menu[] menus;


//생성자: 인스턴스를 만드는 메소드

    Starbucks (int no, String name, Menu[] menus){
        this.no=no;
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
        return "안녕하세요, %d호 %s점입니다".formatted(no,this.name);
    }

}

