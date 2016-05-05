import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RGBTree {
	boolean mem[][][][] = new boolean[1<<13][5][5][5];
	boolean visited[][][][] = new boolean[1<<13][5][5][5];
	String[] graph;
	boolean fun(int mask,int r,int g,int b)
	{
		if(visited[mask][r][g][b])
			return mem[mask][r][g][b];
		else
		{
			int n = graph.length - 1;
			if(r== n/3 && g == n/3 && b == n/3)
			{
				mem[mask ][r][g][b] = true;
				visited[mask][r][g][b] = true;
				return true;
			}
			boolean res = false;
			for(int i= 0 ;i<=n;i++)
			{
				if((mask & (1<<i)) != 0)
				{
					for(int j=0;j<=n;j++)
					{
						if((mask & (1<<j)) == 0 && graph[i].charAt(j) != '.')
						{
							int rr = r,gg = g,bb = b;
							switch (graph[i].charAt(j))
							{
								case 'R' :
									rr +=1;
									break;
								case 'G' :
									gg +=1;
									break;
								case 'B' :
									bb +=1;
									break;
							}
							if(rr<=n/3 && gg <=n/3 && bb <=n/3 )
							res = res || fun(mask | 1<< j, rr,gg,bb );
						}
					}
				}
			}
			visited[mask][r][g][b] = true;
			mem[mask][r][g][b] = res;
		}
		return mem[mask][r][g][b];
	}

	public String exist(String[] G) {
		Arrays.fill(visited,Boolean.FALSE);
		Arrays.fill(mem,Boolean.FALSE);
		graph = G;
		if(fun(1,0,0,0))
		{
			return  "Exist";
		}
		else
			return  "Does not exist";
	}

}

//
//
//	int mem[1<<13][5][5][5]; // we'll memoize the results of calls to f() in this
//
//	vector<string> G;
//
//	// We are using a bit mask to represent set S of the vertices in the connected
//// component. mask & (1<<j) means j is in the bit mask.
//// mask | (1 << j) returns a new bit mask that includes j.
//	bool f(int mask, int r, int g, int b)
//	{
//		bool res = false;
//		if (mem[mask][r][g][b] == -1) {
//			int n = G.size(), k = (n - 1)/3;
//
//			// when all the edge counts are correct, the tree is found:
//			if (r == k && g == k && b == k) {
//				res = true;
//			}
//
//			// pick a new edge to include:
//			for (int i = 0; i < n; i++) {
//				if ( mask & (1<<i) ) {
//					for (int j = 0; j < n; j++) {
//						if ( (! (mask & (1 << j) ) ) && (G[i][j] != '.') ) {
//							// increment the appropriate color
//							int nr = r, ng = g, nb = b;
//							switch ( G[i][j] ) {
//								case 'R':
//									nr++;
//									break;
//								case 'G':
//									ng++;
//									break;
//								case 'B':
//									nb++;
//									break;
//							}
//							// no need to check when there are too many edges of a color:
//							if ( (nr <= k) && (ng <= k) && (nb <= k) ) {
//								res = (res || f(mask | (1<<j), nr,ng,nb) );
//							}
//						}
//					}
//				}
//			}
//			mem[mask][r][g][b] = (res? 1: 0);
//		} else {
//			res = ( (mem[mask][r][g][b] == 1) ? true : false);
//		}
//		return res;
//	}

