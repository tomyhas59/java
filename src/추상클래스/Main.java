package 추상클래스;

public class Main {
    public static void main(String[] args) {

//        FormElement formElement=new FormElement(1); 추상클래스는 인스턴화 불가

        Button button1=new Button(2,"Enter");
        Switch switch1= new Switch(3,true);
        DropDown dropDown=new DropDown(5,new String[] {
                "이름 오름차순","이름 내림차순",
                "크기 오름차순","크기 내림차순",
                "날짜 오름차순","날짜 내림차순"
        });

        clickFormElement(button1);
        clickFormElement(switch1);
        clickFormElement(switch1);
        clickFormElement(dropDown);
    }

    public static void clickFormElement(FormElement fe){
        fe.func();
    }
}
