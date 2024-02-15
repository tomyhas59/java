package 열거형;

public class Button {

    enum Mode{LIGHT,DARK}

    enum  Space{SINGLE,DOUBLE,TRIPLE}

    private Mode mode =Mode.LIGHT;

    private Space space=Space.SINGLE;

    public void setMode(Mode mode){
        this.mode=mode;
    }

    public void setSpace(Space space){
        this.space=space;
    }


    private ButtonMode buttonMode=ButtonMode.LIGHT;
    private ButtonSpace buttonSpace=ButtonSpace.SINGLE;

    public  void setButtonMode(ButtonMode buttonMode){
        this.buttonMode=buttonMode;
    }

    public  void setButtonSpace(ButtonSpace buttonSpace){
        this.buttonSpace=buttonSpace;
    }
}
