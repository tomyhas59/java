public class Main {
    public static void main(String[] args) {
        System.out.println("자바 프로그래밍"); //sout

        double pi = 3.14; //실수
        int age = 20; //정수
        byte    _1b=1; //-127~127
        short   _2b=123;
        long    _8b=4213213123123L; //L 붙이면 큰 수 가능
        float flt1=3.14f; //f 불여야 함
        boolean isMarried = true;

        char sex = 'M' +1; // M에서 1 더한 문자 N
        String str="a" +1 ; //a1

        final int NUM = 1;  //const

        //명시적 형변환
        _1b= (byte) _2b;
        System.out.println(_1b); //123

        String str1="Hello";
        String str2="World";
        String newStr1= new String("Hello");

        System.out.println(str1.equals(newStr1)); //true
        System.out.println(str1==newStr1); //false

        //문자열로 변환
        System.out.println(String.valueOf(_1b));
        System.out.println(String.valueOf(false).charAt(0));//f
    }
}

