import java.util.Scanner;

//4 412
//5 93**
//hint


public class CountNKnights {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		boolean [][] board = new boolean [n][n];
		System.out.println(CountNQueens(board, 0));
		
	}
	
	private static int CountNQueens(boolean [][] board, int row) {
		if(row == board.length) {
			return 1;
		}
		int count = 0;
		for(int col = 0; col < board.length; col++) {
			if(isSafe(board, row, col)) {
				board[row][col] = true;
				count = count + CountNQueens(board, row+1);
				board[row][col] = false;
			}
		}
		return count;
	}
	
	private static boolean isSafe(boolean[][] board, int row, int col) {
		for(int i = 0; i <row; i++) {
			if(board[i][col]) {
				return false;
			}
			int temprow = row;
			int tempcol = col;
			while(temprow>=0 && tempcol>=0) {
				if(board[temprow][tempcol]) {
					return false;
				}
				temprow = temprow-1;
				tempcol = tempcol-1;
			}
			temprow = row;
			tempcol = col;
			while(temprow >= 0 && tempcol < board[0].length) {
				if(board[temprow][tempcol]) {
					return false;
				}
				temprow = temprow-1;
				tempcol = tempcol+1;
			}	
		}
		return true;
	}
}
