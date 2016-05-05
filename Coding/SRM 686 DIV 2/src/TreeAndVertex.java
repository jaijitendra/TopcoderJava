import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TreeAndVertex {
	
	public int get(int[] tree) {
		int[] mp = new int[105];
		Arrays.fill(mp,1);
		mp[0] = 0;
		for(int i=0,len = tree.length;i<len;i++)
		{
			mp[tree[i]]++;
		}
		int max = mp[0];
		for(int i=1,len = 105;i<len;i++)
		{
			if(max <= mp[i])
				max = mp[i];
		}
		return max;
	}
}
