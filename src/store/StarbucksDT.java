package store;

public class StarbucksDT extends Starbucks {

    private  boolean driveThruOpen= true;

    public StarbucksDT(String name, Menu[] menus) {
        super(name, menus);
    }

    public  void  setDriveThruOpen(boolean driveThruOpen){
        this.driveThruOpen=driveThruOpen;
    }

    public  void takeDTOrder(){
        System.out.printf("%s점 드라이브스루 주문 %s%n", this.name,(driveThruOpen?"받음":"불가"));
    }

    @Override
    public String intro(){
        super.intro();
        return "안녕하세요, %s %d호 %s점. 주문 %s%n".formatted(brand, no,this.name,(driveThruOpen?"받음":"불가"));
    }

}
