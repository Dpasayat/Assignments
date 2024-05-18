package Threads_Demo;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class MatrixMultiplication 
{

	public static void main(String args[]) 
	{
	 	 int[][]	firstMatrix	=	generateMatrix(100,100);
	 	 int[][] secondMatrix = generateMatrix(100,100);
	 	 
	 	long startTime = System.nanoTime();
	 	multiplyMatrix(firstMatrix,	secondMatrix);
	 	long endTime = System.nanoTime();
	 	long duration = (endTime - startTime);
	 	System.out.println("Time taken for secquential implementation =\n "+duration+" nanoseconds");
	 	endTime=0; startTime=0;

	 	 
	 	 startTime = System.nanoTime();
	 	try {
			multithreadingMultiplyMatrix(firstMatrix,	secondMatrix);
		} catch (InterruptedException e) {e.printStackTrace();}
	 	endTime = System.nanoTime();
	 	duration = (endTime - startTime);
	 	System.out.println("Time taken for Thread implementation =\n "+duration+" nanoseconds");
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
	
	public static int[][] multithreadingMultiplyMatrix(int[][] matrix1, int[][] matrix2) throws InterruptedException
	{
		int row1 = matrix1.length;
		int column1 = matrix1[0].length;
		int column2 = matrix2[0].length;
		int[][] result = new int[row1][column1];
		
		Thread td = null;
		ArrayList<Thread> tdArr=new ArrayList<>();

		for (int i = 0; i < row1; i++) 
		{
			final int ii =i; // final int jj=j; final int kk =k; 
			Runnable r = ()->{
			for (int j = 0; j < column2; j++) 
			{
				result[ii][j] = 0;
				
				
					for (int k = 0; k < column1; k++) 
					{
						
						result[ii][j] += matrix1[ii][k] * matrix2[k][j];
						
					}
				
			}
			};
			td = new Thread(r);
			td.start();
			tdArr.add(td);
			
		}
		for(Thread x:tdArr) x.join();
		return result;
		
	}
	
	
	public static int[][] executorMultiplyMatrix(int[][] matrix1, int[][] matrix2) throws InterruptedException
	{
		int row1 = matrix1.length;
		int column1 = matrix1[0].length;
		int column2 = matrix2[0].length;
		int[][] result = new int[row1][column1];
		
		Thread td = null;
		ExecutorService executor = Executors.newFixedThreadPool(4);
		ArrayList<Thread> tdArr=new ArrayList<>();

		for (int i = 0; i < row1; i++) 
		{
			final int ii =i; // final int jj=j; final int kk =k; 
			Runnable r = ()->{
			for (int j = 0; j < column2; j++) 
			{
				result[ii][j] = 0;
				
				
					for (int k = 0; k < column1; k++) 
					{
						
						result[ii][j] += matrix1[ii][k] * matrix2[k][j];
						
					}
				
			}
			};
			td = new Thread(r);
			td.start();
			tdArr.add(td);
			
		}
		for(Thread x:tdArr) x.join();
		return result;
		
	}

}
