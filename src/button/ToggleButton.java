package button;

public class ToggleButton extends  Button{
    private  boolean on;

    public ToggleButton(String print, int space, boolean on){
        super(print, space);
        this.on=on;
    }

    @Override
    public  void func(){
     super.func();
     this.on=!this.on;
        System.out.println("대문자 입력: "+(this.on?"ON":"OFF"));

    }
}
