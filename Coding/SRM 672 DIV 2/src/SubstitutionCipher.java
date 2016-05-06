import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SubstitutionCipher {
	
	public String decode(String a, String b, String y) {
		char[] mp = new char[26];
		int[] c1 = new int[26], c2 = new int[26];
		Arrays.fill(mp,'0');
		Arrays.fill(c1,0);
		Arrays.fill(c2,0);
		int count1 = 0,count2=0;
		for(int i=0,len = a.length();i<len;i++)
		{
			mp[b.charAt(i)-'A'] = a.charAt(i);
			c1[a.charAt(i)-'A']++;
			if(c1[a.charAt(i)-'A'] == 1)
				count1++;
			c2[b.charAt(i)-'A']++;
			if(c2[b.charAt(i)-'A'] == 1)
				count2++;
		}

		if(count1 == 25)
		{
			int i1 = 0,i2 = 0;
			for(int i=0;i<26;i++)
			{
				if(c1[i] == 0)
					i1 = i;
				if(c2[i] == 0)
					i2 = i;
			}
			mp[i2] = (char)('A' + i1);
		}

		StringBuilder sb = new StringBuilder(y);
		for(int i=0,len = y.length();i<len;i++)
		{
			if(mp[y.charAt(i)-'A'] == '0')
				return "";
			sb.setCharAt(i,mp[y.charAt(i)-'A']);
		}
		return  sb.toString();
	}
}
