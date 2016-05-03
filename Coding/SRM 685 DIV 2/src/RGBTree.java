import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RGBTree {
	int mem[][][][] = new int[1<<13][5][5][5];
	String[] graph;
	boolean fun(int mask,int r,int g,int b)
	{
		if(mem[mask][r][g][b] != 1)
			return mem[mask][r][g][b] == 1;
		else
		{
			int n = graph.length - 1;
			if(r== n/3 && g == n/3 && b == n/3)
			{
				mem[mask][r][g][b] = 1;
				return true;
			}
			boolean res = false;
			for(int i= 0 ;i<=n;i++)
			{
				if((mask & (1<<i)) != 0)
				{

				}
			}
		}
	}
	public String exist(String[] G) {
		Arrays.fill(mem,-1);
		graph = G;
		return fun(1,0,0,0);
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

