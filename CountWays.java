//arrays given
//split in two arrays such that both same sum
//in how many ways
//1 2 3 4
//23 14
//if  1 2 2 3
//22 31




import java.util.*;


public class CountWays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		
		int c = func(arr,0 ,n, 0, 0);
		System.out.println(c);
		
		
	}

	private static int func(int[] arr, int i, int n, int fsum, int ssum) {
		if(i>n) return 0;
		if(i==n) {
		if(fsum == ssum &&(fsum != 0 && ssum != 0)) {
			return 1;
			}
		return 0;}
		return func(arr, i+1, n, fsum+arr[i], ssum) + func(arr, i+1, n, fsum, ssum+arr[i]);

	}
}
