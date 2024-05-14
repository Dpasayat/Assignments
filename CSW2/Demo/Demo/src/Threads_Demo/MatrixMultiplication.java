package Threads_Demo;
import java.util.*;
public class MatrixMultiplication 
{

	public static void main(String args[]) 
	{
	 	 int[][]	firstMatrix	=	generateMatrix(3,3);
	 	 int[][] secondMatrix = generateMatrix(3,3);

	 	 System.out.println(Arrays.deepToString(multiplyMatrix(firstMatrix,	secondMatrix)));
	}
	public static int[][] generateMatrix(int rows, int columns) 
	{
		int[][] matrix = new int[rows][columns];
		Random random = new Random();
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < columns; j++) 
			{
				matrix[i][j] = random.nextInt() * 10;
			}
		}
		return matrix;
		}
	public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) 
	{

		int row1 = matrix1.length;
		int column1 = matrix1[0].length;
		int column2 = matrix2[0].length;
		int[][] result = new int[row1][column1];

		for (int i = 0; i < row1; i++) 
		{
			for (int j = 0; j < column2; j++) 
			{
				result[i][j] = 0;
				for (int k = 0; k < column1; k++) 
				{
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return result;
	}
	
	public static int[][] multithreadingMultiplyMatrix(int[][] matrix1, int[][] matrix2)
	{
		int row1 = matrix1.length;
		int column1 = matrix1[0].length;
		int column2 = matrix2[0].length;
		int[][] result = new int[row1][column1];

		for (int i = 0; i < row1; i++) 
		{
			for (int j = 0; j < column2; j++) 
			{
				result[i][j] = 0;
				Runnable r = ()->{
					for (int k = 0; k < column1; k++) 
					{
						result[i][j] += matrix1[i][k] * matrix2[k][j];
					}
				};
			}
		}
		return result;
		
	}

}
