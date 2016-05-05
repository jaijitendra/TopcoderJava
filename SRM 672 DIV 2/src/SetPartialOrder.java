import javax.lang.model.util.ElementScanner6;
import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SetPartialOrder {
	
	public String compareSets(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		boolean eq,ls = true,gt = true,non;
		int i,j,len1,len2,match = 0;
		for(i=0,j=0,len1= a.length,len2= b.length;i<len1&&j<len2;)
		{
			if(a[i] == b[j])
			{
				match++;
				i++;j++;
				continue;
			}
			if(a[i]>b[j])
			{
				j++;
				continue;
			}
			else i++;
		}
		if(len1== len2 && len1 == match)
			return "EQUAL";
		if(len1 == match)
			return "LESS";
		if(len2 == match)
			return "GREATER";
		else
			return "INCOMPARABLE";
	}
}
