import java.util.Scanner;
public class 최대로겹치는지점 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] count = new int[101];


        for (int i = 1; i <= N; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for (int j=x1; j<=x2; j++) {
                count[j]++;
            }
        }

        int max = 0;
        for (int i=0; i<=100; i++) {
            if (count[i] > max)
                max = count[i];
        }
        System.out.println(max);
    }
}