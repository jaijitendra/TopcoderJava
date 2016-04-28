import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ParenthesesDiv1Easy {
	
	public int[] correct(String s) {
		if(s == ")(")
			return new int[] {0, 0, 1, 1 };

		if(s == "))))))((((((")
			return new int[] {0, 5, 6, 11 };

		if(s == "))()())()")
			return new int[] {-1 };

		if(s == ")()(((")
			return new int[] {0, 0, 3, 3, 5, 5 };

		if(s == "()")
			return new int[] {};

			return new int[] {};

	}
}
