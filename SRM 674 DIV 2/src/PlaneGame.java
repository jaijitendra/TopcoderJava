import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PlaneGame {
	
	public int bestShot(int[] x, int[] y)
	{
		if(x.length<=2)
			return x.length;

		int maxCount = -1;
		for(int i=0,len = x.length;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(i!=j)
				{
					int slpx12 = x[j] - x[i];
					int slpy12 = y[j] - y[i];
					for (int k = 0; k < len; k++)
					{
						if(k!=i && k!=j)
						{
							int cnt = 0;
							for(int l = 0;l<len;l++)
							{
								int slpx14 = x[l] - x[i];
								int slpy14 = y[l] - y[i];
								if(slpx12 * slpy14 == slpy12 * slpx14)
									cnt++;
								else
								{
									int slpx34 = x[l] - x[k];
									int slpy34 = y[l] - y[k];
									if(slpx12 * slpy34 == -slpy12 * slpx34)
										cnt++;
								}
							}
							maxCount = max(maxCount,cnt);
						}
					}
				}
			}
		}
		return maxCount;
	}
}
