import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DoubleWeights {
	int d1 = 0, d2=0;
	int minCost = Integer.MAX_VALUE;
	String[] wt1,wt2;
	int[] visited;
	void recursivelyFindShortest(int node)
	{
		//reached the sink node.
		if(node == 1)
		{
			if(d1*d2< minCost)
				minCost = d1*d2;
			return;
		}
		if(d1*d2> minCost)
			return;
		for(int i=0;i< wt1.length;i++ )
		{
			if(wt1[node].charAt(i) != '.' && visited[i] == 0)
			{
				visited[i] = 1;
				d1+= wt1[node].charAt(i)-'0';
				d2+= wt2[node].charAt(i)-'0';
				recursivelyFindShortest(i);
				//backtrack
				visited[i] = 0;
				d1-= wt1[node].charAt(i)-'0';
				d2-= wt2[node].charAt(i)-'0';
			}
		}
		return;
	}
	public int minimalCost(String[] weight1, String[] weight2) {
		wt1 = weight1;
		wt2 = weight2;
		visited = new int[22];
		Arrays.fill(visited, 0);
		visited[0]= 1;
		recursivelyFindShortest(0);

	return minCost == Integer.MAX_VALUE ? -1 : minCost;
	}
}
