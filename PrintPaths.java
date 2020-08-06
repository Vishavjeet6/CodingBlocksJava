import java.util.Arrays;

public class PrintPaths {
	public static void main(String[] args) {
		int [][] matrix = new int[][] {
			{0, 0, 9, 0},
			{0, 0, 9, 0},
			{9, 0, 0, 0},
			{0, 9, 0, 0}
		};
		printMazePathWithHurdle(matrix, 3, 3, 0, 0);
	}
	
	private static void printMazePathWithHurdle(int [][] matrix, int endx, int endy, int startx, int starty) {
		if(startx == endx && starty == endy) {
				matrix[endx][endy] = 1;
				System.out.println(Arrays.toString(matrix[0]));
				System.out.println(Arrays.toString(matrix[1]));
				System.out.println(Arrays.toString(matrix[2]));
				System.out.println(Arrays.toString(matrix[3]));
				System.out.println("\n************");
		}
		if(startx > endx || starty > endy) {
			return;
		}
		if(matrix[startx][starty] == 9) {
			return;
		}
		matrix[startx][starty] = 1;
		printMazePathWithHurdle(matrix, endx, endy, startx+1, starty);
		printMazePathWithHurdle(matrix, endx, endy, startx, starty+1);
		matrix[startx][starty] = 0;
	}
	
}
