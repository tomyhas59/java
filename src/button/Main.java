package button;

public class Main {
    public static void main(String[] args) {
        Button button1 =new Button('1',1,"DARK");
        Button buttonPlus =new Button('+',3,"DARK");
        Button buttonClear =new Button('C',2,"DARK");


        button1.place();
        buttonPlus.place();
        buttonClear.place();
    }
}
