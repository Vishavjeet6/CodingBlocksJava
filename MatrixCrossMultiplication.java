//int arr[][] = [10,20,30,40]
//a= [10,20]
//b=[20,30]
//c=[30,40]
// using top down dp
// using recursion

import java.util.*;


public class MatrixCrossMultiplication {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		
		int c = mcm(arr, 0);
		System.out.println(c);
		
	}

	private static int mcm(int[] arr, int count) {
		
		return 0;
	}

}
