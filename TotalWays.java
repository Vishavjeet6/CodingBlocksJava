import java.util.*;


public class TotalWays {
	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		n = n-1;
		sc.close();
		
		totalWays(0, 0, n, n, "");
		System.out.println("Count - " + count);
	}

	private static void totalWays(int startx, int starty, int endx, int endy, String str) {
		// TODO Auto-generated method stub
		if(startx == endx && starty == endy) {
			System.out.println(str);
			TotalWays.count++;
			return;
		}
		if(startx > endx || starty > endy) {
			return;
		}
		totalWays(startx + 1, starty, endx, endy, str + 'H');
		totalWays(startx, starty + 1, endx, endy, str + 'V');
		
	}

}
