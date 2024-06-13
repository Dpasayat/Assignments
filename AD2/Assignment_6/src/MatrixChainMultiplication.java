public class MatrixChainMultiplication {

    // Function to find the minimum number of multiplications needed and the optimal parenthesization
    public static void matrixChainOrder(int[] p) {
        int n = p.length - 1; // Number of matrices
        int[][] m = new int[n][n]; // m[i][j] will hold the minimum number of multiplications needed to compute the product of matrices A[i]...A[j]
        int[][] r = new int[n][n]; // s[i][j] will hold the index of the matrix after which the product is split in the optimal parenthesization

        // cost is zero when multiplying one matrix
        for (int i = 0; i < n; i++) {
            m[i][i] = 0;
        }

        // L is chain length
        for (int L = 2; L <= n; L++) {
            for (int i = 0; i < n - L + 1; i++) {
                int j = i + L - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    // q = cost/scalar multiplications
                    int q = m[i][k] + m[k + 1][j] + p[i] * p[k + 1] * p[j + 1];
                    if (q < m[i][j]) {
                        m[i][j] = q;
                        r[i][j] = k;
                    }
                }
            }
        }

        System.out.println("Minimum number of multiplications is " + m[0][n - 1]);
        System.out.print("Optimal parenthesization is: ");
        printOptimalParenthesis(r, 0, n - 1);
        System.out.println();
    }

    // Function to print the optimal parenthesization
    public static void printOptimalParenthesis(int[][] s, int i, int j) {
        if (i == j) {
            System.out.print("A" + (i + 1));
        } else {
            System.out.print("(");
            printOptimalParenthesis(s, i, s[i][j]);
            printOptimalParenthesis(s, s[i][j] + 1, j);
            System.out.print(")");
        }
    }

    public static void main(String[] args) {
        int[] arr = {30,35,15,5,10,20,25}; // Dimensions of matrices
        
        matrixChainOrder(arr);
    }
}
