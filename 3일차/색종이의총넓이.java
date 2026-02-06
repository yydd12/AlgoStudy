import java.util.Scanner;

public class 색종이의총넓이 {
	public static boolean isIn(int x, int y, int A, int B) {
		if ((x>=A && x<A+8) && (y>=B y<B+8)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];

		for (int i=0; i<N; i++) {
			int a[i] = sc.nextInt();
			int b[i] = sc.nextInt();
		}

		for (int x=-100; x<=100; x++) {
			for (int y=-100; y<=100; y++) {
				for (int i=0; i<N; i++) {
					if (
						isIn(x, y, a[i], b[i]) || isIn()

				}
			}
		}
	}
}
