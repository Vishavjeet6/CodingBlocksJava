
public class SudokuSolver {
	public static void main(String[] args) {
//		int [][] arr = {
//				{5,3,0,0,7,0,0,0,0},
//				{6,0,0,1,9,5,0,0,0},
//				{0,9,8,0,0,0,0,6,0},
//				{8,0,0,0,6,0,0,0,3},
//				{4,0,0,8,0,3,0,0,1},
//				{7,0,0,0,2,0,0,0,6},
//				{0,6,0,0,0,0,2,8,0},
//				{0,0,0,4,1,9,0,0,5},
//				{0,0,0,0,8,0,0,1,9}
//			};
		int [][] arr = {
				{7,0,0,0,4,0,0,0,3},
				{0,0,8,0,0,6,0,5,0},
				{0,2,5,0,0,3,0,0,7},
				{0,0,6,0,2,8,0,0,1},
				{0,0,0,6,0,4,0,0,0},
				{5,0,0,7,1,0,4,0,0},
				{2,0,0,9,0,0,1,3,0},
				{0,5,0,3,0,0,6,0,0},
				{6,0,0,0,5,0,0,0,8}
		};
		int n = 9;
		boolean[][] fixedCells = new boolean[9][9];
		setFixedCells(arr, fixedCells, n);
		boolean solve = sudokuSolver(arr, fixedCells, 0, 0, n);
		System.out.println(solve);
		for (int[] row : arr) {
	        for (int j : row) {
	            System.out.print(j + " ");
	        }
	        System.out.println("");
		}
	}
	
	public static boolean canPlace(int[][] arr, int row, int col, int n, int setnum) {
		for(int i =0; i<row; i++) {
			if(arr[i][col] == setnum) return false;
		}
		for(int i = 0; i<col; i++) {
			if(arr[row][i] == setnum) return false;
		}
		for(int i = (row/3)*3 ;i< row/3 + 3; i++) {
			for(int j = (col/3)*3; j < col/3 + 3;j++) {
				if(arr[i][j] == setnum) return false;
			}
		}
		return true;
	}

	private static boolean sudokuSolver(int[][] arr, boolean[][] fixedCells, int row, int col, int n) {
		if(row == n) {
			return true;
		}
		if(col == n) {
			return sudokuSolver(arr, fixedCells, row+1, 0, n);
		}
		if(fixedCells[row][col]) {
			return sudokuSolver(arr, fixedCells, row, col+1, n);
		}
		for(int setnum = 1; setnum <= n; setnum++) {
			boolean check = canPlace(arr, row, col, n, setnum);
			if(check) {
				arr[row][col] = setnum;
				boolean solverest = sudokuSolver(arr, fixedCells, row, col+1, n);
				if(solverest){
					return true;
				} else {
					arr[row][col] = 0;
				}
				
			}
		}
		return false;
	}

	private static void setFixedCells(int [][]arr, boolean[][]fixedCells, int n) {
		for(int i = 0;i < n; i++) {
			for(int j =0;j < n;j++) {
				if(arr[i][j] != 0) fixedCells[i][j] = true;
			}
		}	
	}
}
