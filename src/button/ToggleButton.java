package button;

public class ToggleButton extends  Button{
    private  boolean on;

    public ToggleButton(String print, boolean on){
        super(print);
        this.on=on;
    }

}
