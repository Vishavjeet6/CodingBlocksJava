import java.util.*;
//atmax pair can exist
//n=3
//{1},{2},{3}
//{1,2},{3}
//.
public class FriendPairing {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int arr[] = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = i+1;
		}
		
		Subset(arr, n);
		
	}

	private static void Subset(int[] set, int n) {
		
		  
        // Run a loop for printing all 2^n 
        // subsets one by obe 
        for (int i = 0; i < (1<<n); i++) 
        { 
         
  
            // Print current subset 
            for (int j = 0; j < n; j++) 
  
                
                if ((i & (1 << j)) > 0) 
                    System.out.print(set[j] + " "); 
  
            System.out.println(); 
		
	}
        }
		
	
}

