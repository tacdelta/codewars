import java.util.ArrayList;
/*
This time no story, no theory. The examples below show you how to write function accum:

Examples:

Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"

 */

public class Accumul {

    public static String accum(String s) {
        ArrayList<String> kis = new ArrayList<> ();
        for (int i = 0; i < s.length (); i++) {
            char ch;
            ch = s.charAt ( i );
            String c = String.valueOf ( ch );
            if (i == 0) {
                kis.add ( c.toUpperCase () );
            } else {
                kis.add ( c.toUpperCase () );
                for (int j = 0; j < (i); j++)
                    kis.add ( c.toLowerCase () );
            }
            if (i != (s.length () - 1))
                kis.add ( "-" );
        }
        StringBuilder sb = new StringBuilder();
        for (String z : kis)
        {
            sb.append(z);
        }
        return(sb.toString ());
    }
}

