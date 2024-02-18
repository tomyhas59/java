package library;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {

        Random random=new Random();
        random.setSeed(1234);
        int randomInt=random.nextInt();
        int randomInt2=random.nextInt(0,10);

        BigInteger bigInteger=new BigInteger("1234567890");

        BigInteger bigInteger1=bigInteger.add(new BigInteger("5"));
        BigInteger bigInteger2=bigInteger1.subtract(BigInteger.valueOf(5));

        var num1=new BigDecimal("0.2").add(BigDecimal.valueOf(0.3)).floatValue();

        //문자열 클래스------------------------------------------------

        String[] arr= {"감자","당근","양파","오이"};
        StringJoiner stringJoiner=new StringJoiner("/", "@","#");

        for(var a:arr){
            stringJoiner.add(a);
        }

        System.out.println(stringJoiner.toString()); //@감자/당근/양파/오이#

        //---------------------------------------------------

        var strBff1= new StringBuffer(); //기본 16자리
        var strBff2= new StringBuffer(2); //2자리, 숫자 너무 작으면 증축 비용 소모
        var strBff3= new StringBuffer("Hello"); //문자열 길이 +16자리

        int[] cap={strBff1.capacity(),strBff2.capacity(),strBff3.capacity()};

        strBff2.append("안녕하세요").append("쿠쿠하세요");
        int cpa2= strBff2.capacity(); //공간 늘어남

        strBff2.setLength(100);
        int cpa22= strBff2.capacity(); // 100

        System.out.println(strBff2);

        //---------------------------------------------------

        var strBuild=new StringBuilder("0123456789")
                .delete(3, 5)
                .deleteCharAt(0)
                .insert(2,"ABC")
                .replace(2,4,"OneTwo")
                .reverse()
                .toString();


    }
}
