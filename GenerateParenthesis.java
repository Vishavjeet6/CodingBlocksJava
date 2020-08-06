import java.util.Scanner;
import java.util.Stack;


//n=2
//(())
//()()



public class GenerateParenthesis {
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		String x = "";
				
		for(int i =0; i< n; i++) {
			x  += '(';
		}
		for(int i = 0; i < n; i++) {
			x += ')';
		}
		
		// generate combinations

		Combinations(x , "");
		
		
	}
	
	
  

	private static void Combinations(String str, String ans) {
		
		 if (str.length() == 0) { 
			 	if(CheckBalance(ans)) System.out.println(ans);
	            return; 
	        } 
	  
	        for (int i = 0; i < str.length(); i++) { 
	  
	          
	            char ch = str.charAt(i); 
	  
	            
	            String ros = str.substring(0, i) +  
	                         str.substring(i + 1); 
	  
	           
	            Combinations(ros, ans + ch); 
	        } 		
	}
	
	
	public static boolean CheckBalance(String str) {
		Stack<Integer> stck = new Stack<Integer>(); 
		for(int i = 0; i< str.length(); i++) {
			if(str.charAt(i) =='(') {
				stck.push(1);
			}
			else {
				if(stck.isEmpty()) return false;
			
				stck.pop();
			}
		}
		return true;
	}
	
	
	
}






