import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Quacking {
	int[] counts = new int[5];
	int IndexForChar(char c)
	{
		switch (c)
		{
			case 'q' :
				return 0;
			case 'u' :
				return 1;
			case 'a' :
				return 2;
			case 'c' :
				return 3;
			case 'k' :
				return 4;
			default:
				return -1;
		}
	}
	int maxItem()
	{
		int max = counts[0];
		for(int i=1;i<=4;i++)
		{
			if(counts[i]>counts[i-1])
				return -1;
			max = max(counts[i],max);
		}
		return max;
	}
	public int quack(String s) {
		int minDucks = -1;
        int mx = -1;
		Arrays.fill(counts,0);;
		for(int i=0,len = s.length();i<len;i++)
		{
			counts[IndexForChar(s.charAt(i))]++;
			mx = maxItem();
			if(mx == -1)
				return -1;
			minDucks = max(minDucks, mx);
			if(counts[4]==1)
			{
				for(int ii=0;ii<=4;ii++)
				{
					counts[ii] -= 1;
				}
			}

		}
		for(int ii=0;ii<=4;ii++)
		{
			if(counts[ii] != 0)
				return -1;
		}
		return minDucks;
	}
}
