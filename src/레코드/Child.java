package 레코드;

public record Child (

        //기본적으로  private, final로 생성됨,
        //getter 사용 가능
    String name,
    int birthYear,
    Gender gender
){}

/* 클래스방식

public class ChildClass{
    private final String name;
    private final int birthYear;
    private final  Gender gender;

    public ChildClass(String name,int birthYear,Gender gender) {
        this.name = name;
        this.birthYear=birthYear;
        this.gender=gender;
    }

    public String getName() {return name;}
    public int getBirthYear(){return  birthYear;}
    public Gender getGender(){return gender;}
}*/