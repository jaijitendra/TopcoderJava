import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ParenthesesDiv2Medium {
	
	public int[] correct(String s) {
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		int curscore=0;
		for(int i= 0;i < s.length();i++)
		{
			if(s.charAt(i) == '(')
				curscore++;
			else
				curscore--;
			if(curscore<0)
			{
				curscore=1;
				resultList.add(i);
			}
		}
		for(int i=0,pointer= s.length() - 1 ;i<curscore/2;pointer--)
		{
			if(s.charAt(pointer) == '(')
			{
				resultList.add(pointer);
				i++;
			}
		}
		int[] result = new int[resultList.size()];
		for(int i=0;i<resultList.size() ; i++)
		{
			result[i] = resultList.get(i);
		}
		return result;
	}
}
