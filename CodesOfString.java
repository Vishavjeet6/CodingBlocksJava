import java.util.*;

//"1234"
//abcd
//lcd
//awd
//spoj acode

public class CodesOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int n = str.length();
		for(int i = 1; i< 3; i++) {
			String ans = "";
			for(int j = 0; j< n; j++) {
				if( i == 1) {
					for(int k =0; k< n; k++) {
//						or int p = Integer.valueOf(str)
						int p = str.charAt(k) - '0' + 96;
						ans += (char)p;
					}		
					}
				
			
			
			}
			}
		}
		
	}
	
	
