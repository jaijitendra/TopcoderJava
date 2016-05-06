import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearSlowlySorts
{
    public int minMoves(int[] w)
    {
        int minElement = 0, maxElement = 0, len = w.length;
        for(int i=1;i<len;i++)
        {
            if(w[i]>w[maxElement])
                maxElement = i;
            if(w[i]<=w[minElement])
                minElement = i;
        }
        int ans = 0;
        if(maxElement == len-1 || minElement == 0)
        {
            int st = 1;
            for(st = 1;st<len;st++)
            {
                if(w[st]<w[st-1])
                    break;
            }
            if(st!=len)
                return 1;
            else
            {
                if(maxElement == len-1 && minElement == 0)
                    return 0;
                else
                    return 1;
            }
        }
        if(maxElement == 0 || minElement == len-1)
        {
            ans = (maxElement == 0 ? 1 : 0) + (minElement == len-1 ? 1 : 0);
            return ans+1;
        }
        return 2;
    }
}
