
import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str1=sc.next();
        boolean bool=sc.nextBoolean();
        int intNum=sc.nextInt();

        System.out.println("str1: " + str1);
        System.out.println("str2: " + bool);
        System.out.println("str3: " + intNum);

        while (sc.hasNextInt()){
            System.out.println(("str: " + sc.nextInt()));
        }

        sc.close();
    }
}
