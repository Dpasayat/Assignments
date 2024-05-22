public class LongestCommonSubsequence {

    public static int lcs(String s1, String s2) {
        int m = s1.length();
        int r = s2.length();
        
        // Create a 2D array to store the lengths of LCS
        int[][] dp = new int[m + 1][r + 1];

        // Build the dp array from the bottom up
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= r; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // dp[m][r] contains the length of LCS for s1[0..m-1], s2[0..r-1]
        return dp[m][r];
    }

    public static void main(String[] args) {
        String s1 = "ABCBDAB";
        String s2 = "BDCAB";

        System.out.println("Length of Longest Common Subsequence: " + lcs(s1, s2));
    }
}

//Output:
// Length of Longest Common Subsequence: 4