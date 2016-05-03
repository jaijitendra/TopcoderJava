import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MultiplicationTable2Easy {
	
	public String isGoodSet(int[] table, int[] t) {
		//java.util.Arrays.sort(t);
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		for(int i=0,len = t.length;i<len;i++)
		{
			mp.put(t[i] , 1);
		}
		for(int i=0,len = t.length;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(mp.get(table[t[i]*(int)Math.sqrt(table.length) + t[j]]) == null )
				{
					return "Not Good";
				}
			}
		}
		return "Good";
	}
}
