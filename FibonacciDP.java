import java.util.Scanner;

public class FibonacciDP {
	public static void main(String[] args) {
		int []dp = new int[10000];
		dp[0] = 0;
		dp[1] = 0;
		dp[2] = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(fib(n, dp));
	}
	
	public static int fib(int n, int[]dp) {
		if(n==0 || n==1) return n;
		if(dp[n] != 0) return dp[n];
		int fibn1 = fib(n-1, dp);
		int fibn2 = fib(n-2, dp);
		int fibn = fibn1 + fibn2;
		dp[n] = fibn;
		return fibn;
	}
}
