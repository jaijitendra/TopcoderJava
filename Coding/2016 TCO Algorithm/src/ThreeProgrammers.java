import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class ThreeProgrammers {

    public String validCodeHistory(String code) {
        int aCount = 0, bCount = 0, cCount = 0;
        for (int i = 0, len = code.length(); i < len; i++) {
            switch (code.charAt(i)) {
                case 'A':
                    aCount++;
                    break;
                case 'B':
                    bCount++;
                    break;
                case 'C':
                    cCount++;
                    break;
            }
        }
        int[] mp = new int[code.length()];
        int i=0, len = code.length();
        StringBuilder sb  = new StringBuilder(code);
        for (;i<len && cCount > 0;)
        {
            if(mp[i]!= 1)
            {
                sb.setCharAt(i,'C');
                mp[i] = 1;
                i = i+3;
                cCount--;
            }
            else
            {
                i++;
            }
        }
        i= 0;
        for (;i<len&& bCount > 0;)
        {
            if(mp[i]!= 1)
            {
                sb.setCharAt(i,'B');
                mp[i] = 1;
                i = i+2;
                bCount--;
            }
            else
            {
                i++;
            }
        }
        i= 0;
        for (;i<len;i++)
        {
            if(mp[i]!= 1)
            {
                sb.setCharAt(i,'A');
                mp[i] = 1;
            }
        }
        return new String(sb);
    }
}
