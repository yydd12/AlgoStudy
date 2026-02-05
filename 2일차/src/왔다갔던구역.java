import java.util.Scanner;
public class 왔다갔던구역 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[2001];
        int cd = 1000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            
            if (dir=='R') {
                for (int j=0; j<x; j++) {
                    arr[cd] += 1;
                    cd++;
                }
            } else {
                for (int j=0; j<x; j++) {
                    cd--;
                    arr[cd] += 1;
                }
            }
        }
        int result = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]>=2) result++;
        }
        System.out.println(result);
    }
}