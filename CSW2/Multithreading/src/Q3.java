
public class Q3 
{

	public static void main(String[] args) 
	{
		int[][] matrixA = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] matrixB = {
				{9,8,7},
				{6,5,4},
				{3,2,1}
		};
		int[][] result = multiplyMatrices(matrixA,matrixB);
		printMatrix(matrixA);
		printMatrix(matrixB);
		printMatrix(result);
		
	}
	
	public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB)
	{
		int rowA=matrixA.length;
		int colA=matrixA[0].length;
		int colB=matrixB[0].length;
		
		int[][] result = new int[rowA][colB];
		Thread[] threads = new Thread[rowA];
		for(int i=0;i<rowA;i++)
		{
			final int row = i;
			threads[i] = new Thread(()->{
				for(int j=0;j<colB;j++)
				{
					for(int k=0;k<colA;k++)
					{
						result[row][j]+=matrixA[row][k]*matrixB[k][j];
					}
				}
			});
			threads[i].start();
		}
		try {
			for(Thread t: threads)
				t.join();
		}catch(Exception e) {}
		return result;
	}
	
	public static void printMatrix(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+"  ");
			System.out.println();
		}
		System.out.println("----------------------------------------");
	}

}
