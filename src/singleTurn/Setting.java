package singleTurn;

public class Setting {
    private static Setting setting;

    private Setting (){}

    public  static Setting getInstance(){
        if(setting==null){
            setting=new Setting();
        }
        return setting;
    }
    private  int volume=5;

    public  int getVolume(){
        return  volume;
    }

    public void incVolume(){
        volume++;
    }
}
