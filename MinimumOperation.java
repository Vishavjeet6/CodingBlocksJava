//s1 = "abbg"
//s2 = "abgg" replace, delete, remove, addition

//using bottom up dp
//s1 = abcd
//s2 = dabc  s2 delete d add d at last
//ans 2

import java.util.*;


public class MinimumOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		sc.close();
		
//		int count = editDistanceRecursion(s1, s2);
		int count1 = editDistanceIterative(s1, s2);
//		System.out.println(count);
		System.out.println(count1);
	}

	private static int editDistanceIterative(String s1, String s2) {
		int dp[][] = new int [s1.length()+1][s2.length()+1];
		
		for(int i = 0;i <=s2.length(); i++) {
			for(int j = 0; j<=s1.length(); j++) {
				dp[i][s1.length()] = s2.length()-i; 
			}
		}
		
		for(int i =0; i<=s1.length(); i++) {
			dp[s2.length()][i] = s1.length()-i;
		}
		
		for(int i = s2.length()-1; i >=0; i--) {
			for(int j = s1.length()-1; j >=0; j--) {
				if(s2.charAt(i) == s1.charAt(j)) {
					dp[i][j] = dp[i+1][j+1];
				} else {
					dp[i][j] = Math.min(dp[i][j+1], Math.min(dp[i+1][j], dp[i+1][j+1])) + 1;
				}
			}
		}	
		
		return dp[0][0];
	}

	private static int editDistanceRecursion(String s1, String s2) {
		int ans;
		if(s1.length()==0) {
			return s2.length();
		}
		if(s2.length() == 0) {
			return s1.length();
		}
		if(s1.charAt(0) == s2.charAt(0)) {
			ans = editDistanceRecursion(s1.substring(1), s2.substring(1));
		} else {
//			edit them
//			int f1 = editDistance(s1.substring(1), s2.substring(1)) + 1;
//			int f2 = editDistance(s1.substring(1), s2.substring(1)) + 1;
//			int f3 = editDistance(s1.substring(1), s2.substring(1)) + 1;
			ans = Math.min(f1, Math.min(f2,f3));
			
		}
		
		return ans;
		}
	}
