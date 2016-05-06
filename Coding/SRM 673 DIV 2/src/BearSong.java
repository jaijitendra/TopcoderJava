import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearSong {
	
	public int countRareNotes(int[] notes) {
		int[] count = new int[1001];
		Arrays.fill(count,0);
		for(int i=0,len = notes.length;i<len;i++)
		{
			count[notes[i]]++;
		}
		int no,sum= 0;
		for(no=1;no<1001;no++)
		{
			if(count[no] == 1)
				sum++;
		}

		return sum;
	}
}
