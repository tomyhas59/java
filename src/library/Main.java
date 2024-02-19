package library;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.*;
import java.time.format.DateTimeFormatter;
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
                .toString(); //toString()을 해야 반환됨

        //날짜와 시간--------------------------------------------
        LocalDate today=LocalDate.now(); //현재 년도-월-일
        LocalTime thisTime=LocalTime.now(); //현재 시간:분:초
        LocalDateTime now=LocalDateTime.now();//현재 년도-월-일, T 시간:분:초

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy년 MM월 dd일, HH시 mm분 ss초");
        System.out.println(now.format(formatter));

        LocalDateTime lunchTime=LocalDateTime.of(2024,2,25,18, 0);

        var newTime= lunchTime.minusDays(1); //lunchTime은 바뀌지 않고 새로운 newTime 생성
        System.out.println(newTime);

        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        var here=zonedDateTime.getZone();
        System.out.println(here); //Asia/Seoul

        LocalDate dayE=LocalDate.of(1993,2,25);
        LocalDate dayY=LocalDate.of(1991,1,31);
        //문자열에서 시간 인스턴스로------------------------------------------
        var dinnerTime="2024/02/23 18:30:00";
        DateTimeFormatter formatterD=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        var newDinnerTime=LocalDateTime.parse(dinnerTime,formatterD);
        //날짜 차이 계산----------------------------------------------------
        var day=Period.between(dayY,dayE);
        int[] days={
                day.getYears(),
                day.getDays(),
                day.getMonths(),
              };

        LocalDateTime randomTime=LocalDateTime.of(2024,3,31,12,30);
        Duration duDay=Duration.between(randomTime, now);
        long[] duDays={
                duDay.toDays(),
                duDay.toHours(),
                duDay.toMinutes(),
                duDay.toSeconds(),
        };
    }
}
