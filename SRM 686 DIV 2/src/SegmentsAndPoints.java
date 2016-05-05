import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SegmentsAndPoints {
	
	public String isPossible(int[] p, int[] l, int[] r) {
		Arrays.sort(p);
		boolean[] visited = new boolean[101];
		Arrays.fill(visited,false);
		for(int i=0,len = p.length;i<len;i++)
		{
			int save = -1;
			for(int j=0;j<len;j++)
			{
				if(!visited[j] && (p[i]>=l[j] && p[i]<=r[j]))
				{
					if(save == -1 || r[j] < r[save])
						save = j;
				}
			}
			if(save == -1)
				return "Impossible";
			visited[save] = true;
		}
		return "Possible";
	}
}
