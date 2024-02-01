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

//시작 글자가 같으면 차이 계산
        String str1="Hello";
        String str2="He";
        int int_compareTo= str1.compareTo(str2); //3
//글자가 달라진 첫 글자의 정수값의 차이 계산
        String str3="ADASD";
        String str4="AFA";
        int int_compareTo2= str3.compareTo(str4); //-2


        // 문자열로 변환
       String  valueOf_1b= String.valueOf(_1b);
       char charAt= String.valueOf(false).charAt(0);//f

        String str5=" 안 녕 하 세 요 ";
        String str6=str5.trim();

        boolean bool_str3= str5.contains("녕"); //true
        boolean bool2_str3= str5.startsWith(" 안 녕"); //true
        boolean bool3_str3= str5.endsWith("녕"); //false
        boolean bool4_str4=str5.matches(" 안 녕 하 세 요 "); //true


      char[] charArray =str6.toCharArray();
    }
}

