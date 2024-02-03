public class Method {
    public static void main(String[] args) {


        int age=add(10,20);


        double avg=getAveratge(3,91,14,27,4);
        double avg2=getAveratge(new int[] {3,91,14,27,4});

    }

    //메인 메소드 외부에 선언----------------------------------

    static  int add (int num1, int num2){

        return num1+num2;
    }
    static void voidAdd (int num1, int num2){
        System.out.println("void는 반환 불가능");
    }

    static  boolean checkIf(String text, String token){
        return  text.toLowerCase().contains(token.toLowerCase());
    }

    static double getAveratge(int... nums){
        double result=0.0;
        for(int num:nums){
            result+=num;
        }
        return  result/nums.length;
    }
}
