package button;


public class Button {

   private static  String mode="LIGHT";
  public static void switchMode(){
        mode=mode.equals("LIGHT") ? "DARK" :"LIGHT";
    }

private String print;
private int space=1;

public Button(String print, int space) {
    this.print = print;
    this.space = space;
}

public void setSpace (int space){
    if(space<1||space>4) return;
    this.space=space;
}

void  place(){
    System.out.printf(
            "표시: %s, 공간: %s, 모드:%s%n",
            print,space,mode
    );
}

public  void func(){
    System.out.println(print + "입력 적용");
}

}
