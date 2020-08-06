
import java.util.*;


public class FirstNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr [] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		getNegative(arr, n, k);
		System.out.println();
		
		t--;
		}
		sc.close();
	
	}

	private static void getNegative(int[] arr, int n, int k) {
		LinkedList<Integer> que = new LinkedList<>();
		
		int i;
		for(i = 0; i<k; i++) {
			if(arr[i] < 0) {
				que.add(i);
			}
		}
		for(; i<n; i++) {
			if(!que.isEmpty()) {
				System.out.print(arr[que.peek()] + " ");
			}
			else {
				System.out.print("0"+" ");
			}
			
			while((!que.isEmpty()) && que.peek() <(i-k+1)) {
				que.remove();
			}
			
			if(arr[i] <0) que.add(i);
		}
		
		if(!que.isEmpty()) {
			System.out.print(arr[que.peek()]+ " ");
		}else {
			System.out.print("0"+ " ");
		}
	}
}
