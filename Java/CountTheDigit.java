/*
Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer. Square all numbers k (0 <= k <= n) between 0 and n.
Count the numbers of digits d used in the writing of all the k**2. Call nb_dig (or nbDig or ...) the function taking n and d as parameters and returning this count.
 */

public class CountDig {

    public static int nbDig(int n, int d) {
        int count = 0;
        for (int i = 0; i < (n + 1); i++) {
            int num = i*i;
            String str = Integer.toString(num);
            char[] j = str.toCharArray();
            for (char cr : j) {
                int eq = Character.getNumericValue(cr);
                if (eq==(d))
                    count++;
            }
        }
        return count;
    }
}
