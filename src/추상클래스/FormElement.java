package 추상클래스;

public abstract class FormElement {
    protected  int space;

    public FormElement(int space){
        this.space=space;
    }

    abstract  void func(); //자식들이 각각 구현
}
