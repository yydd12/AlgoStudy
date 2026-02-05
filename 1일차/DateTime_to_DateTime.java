import java.util.Scanner;

public class DateTime_to_DateTime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int result = (1440*A + 60*B + C) - (1440*11 + 60*11 +11);

        if (result<0) result = -1;

        System.out.println(result);

    }
}
