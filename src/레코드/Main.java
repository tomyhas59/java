package 레코드;

public class Main {
    public static void main(String[] args) {
        Child child1= new Child("홍길동",2020,Gender.MALE);

        String childStr= child1.toString();

        var children=new Child[]{
                new Child("임꺽정",2021,Gender.MALE),
                new Child("황진이",2011,Gender.FEMALE),
        };

        for(var child:children){
            System.out.printf("%s %d년생 %s 어린이 %n", child.gender().getGen(), child.birthYear(), child.name());
        }
    }
}
