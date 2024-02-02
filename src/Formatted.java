public class Formatted {
    public static void main(String[] args) {

//        %d: 'Decimal', 10진수 정수
//        %f: 'Floating-point', 부동 소수점 숫자
//        %c: 'Character', 문자
//        %b: 'Boolean', 부울 값
//        %x: 'Hexadecimal', 16진수 정수
//        %n: 줄바꿈
//        %5d: 5자리 확보
//        %05d : 5자리에서 공백 0으로 채움
//        %+5d : 양수 앞에 + 붙임
//        %,5d : 쉼표 사용 543,412
//        %-5d : 5자리 확보 왼쪽 정렬

//        %.2s : 2글자만
//        %.2f : 소수점 2자리만(반올림)
        String str="%s의 나이는 %+05d살이다";
        String name="김명철";
        int age=20;
//        String str1=str.formatted(name,age);
        String str1=String.format(str, name, age);




    }


}
