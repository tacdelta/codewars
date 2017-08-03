import java.util.*;
/*
Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :

 "(p1**n1)(p2**n2)...(pk**nk)"

with the p(i) in increasing order and n(i) empty if n(i) is 1.

Example: n = 86240 should return "(2**5)(5)(7**2)(11)"

 */

public class PrimeDecomp {
    public static String factors(int n) {
        List primFactors = primeFactors ( n );
        List<String> s = new ArrayList<> ();
        int count = 1;
        int l = 1;
        int g = primFactors.size ();
        while (l <= g) {
            if (l == primFactors.size ()) {
                primFactors.add ( 0 );
            }
            if (primFactors.get ( l - 1 ) == primFactors.get ( l )) {
                count++;
            } else {
                if (count == 1) {
                    s.add ( "(" + primFactors.get ( l - 1 ) + ")" );
                    count = 1;
                } else {
                    s.add ( "(" + primFactors.get ( l - 1 ) + "**" + count + ")" );
                    count = 1;
                }
            }
            l++;
        }
        String list = String.join ( "", s );
        return (list);
    }


    public static List primeFactors(int number) {    //создаёт массив со списком простых чисел в виде [2,2,3,3,3,4....]
        int n = number;
        List pf = new ArrayList ();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                pf.add ( i );
                n /= i;
            }
        }
        return pf;
    }
}

