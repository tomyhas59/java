public class Main {
    public static void main(String[] args) {
        System.out.println("자바 프로그래밍"); //sout

        double pi = 3.14; //실수
        int age = 20; //정수
        byte    _1b=1; //-127~127
        short   _2b=123;
        long    _8b=4213213123123L; //L 붙이면 큰 수 가능
        boolean isMarried = true;
        char sex = 'M'; //한 글자
        String name = "홍길동"; //문자

        final int NUM = 1;  //const
        System.out.println(_8b);

//명시적 형변환
        _1b= (byte) _2b;
        System.out.println(_1b);

    }
}

