package stringMatchingAlgorithm;

public class RabinKarp 
{
    public final static int d = 10; // Number of characters in the input set

    static void search(String pattern, String txt, int q) 
    {
        int m = pattern.length();
        int n = txt.length();
        int i, j;
        int p = 0; // Hash value for pattern
        int t = 0; // Hash value for text
        int h = 1;

        // Calculate h = d^(m-1) % q
        for (i = 0; i < m - 1; i++)
            h = (h * d) % q;

        // Calculate hash value for pattern and text
        for (i = 0; i < m; i++) 
        {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        // Slide the window over the text
        for (i = 0; i <= n - m; i++) 
        {
            if (p == t) 
            {
                // Perform character-by-character matching
                for (j = 0; j < m; j++) 
                {
                    if (txt.charAt(i + j) != pattern.charAt(j))
                        break;
                }
                if (j == m)
                    System.out.println("Pattern found at position " + i);
            }

            // Calculate hash value for the next window
            if (i < n - m) 
            {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
                if (t < 0)
                    t += q;
            }
        }
        System.out.println("___________________________________");
    }

    public static void main(String[] args) 
    {
        String txt = "abcaabccabcba"; 
        String pattern = "abc"; 
        int q = 13; // Prime number for hash calculations
        System.out.println("Text: "+txt+"\nPattern: "+pattern);
        search(pattern, txt, q);
        
        txt="abcaabccabcba";pattern="abc";
        System.out.println("Text: "+txt+"\nPattern: "+pattern);
        search(pattern, txt, q);
        
        txt="aaaaaaa";pattern="aaa";
        System.out.println("Text: "+txt+"\nPattern: "+pattern);
        search(pattern, txt, q);
    }
}
