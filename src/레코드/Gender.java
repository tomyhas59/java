package 레코드;

public enum Gender {
    MALE("남자"),
    FEMALE("여자");

    private  String gen;

    Gender(String gen) {
        this.gen = gen;
    }

    public String getGen(){return  gen;}
}
