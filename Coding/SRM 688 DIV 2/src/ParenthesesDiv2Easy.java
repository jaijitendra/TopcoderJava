import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ParenthesesDiv2Easy {
	
	public int getDepth(String s) {
		int depth = 0, maxDepth = Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == '(')
			{
				depth++;
			}
			else
				depth--;
			maxDepth = max(depth,maxDepth);
		}
		return maxDepth;
	}
}
