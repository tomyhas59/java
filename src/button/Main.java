package button;

public class Main {
    public static void main(String[] args) {

        Button button1 =new Button("1",1);
        Button buttonPlus =new Button("+",3);
        Button buttonClear =new Button("C",2);
        Button toggle=new ToggleButton("Toggle",5,true);//자식 클래스가 부모 자료형에 들어갈 수 있음

        Button[] buttons={button1,buttonPlus,buttonClear};


        for(Button button :buttons){button.place();}

        Button.switchMode();

        for(Button button :buttons){button.place();}
        button1.setSpace(2);



        toggle.func();
        toggle.func();

        }


}
