import java.util.Scanner;

public class 요일맞추기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        int[] date = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        if ( m1<m2 || (m1==m2 && d1<d2)) {
            int count = 0;
            for (int i=m1; i<m2; i++) {
                count += date[i];
            }
            int cal = Math.abs(count - d1 + d2);
            System.out.println(day[cal%7]);
        } else {
            int count = 0;
            for (int i=m2; i<m1; i++) {
                count += date[i];
            }
            int cal = Math.abs(count + d1 - d2);
            if (cal%7==0) System.out.println(day[cal%7]); 
            else System.out.println(day[7-cal%7]);
        }
        
    }
}