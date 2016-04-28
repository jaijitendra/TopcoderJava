import org.junit.Test;
import static org.junit.Assert.*;

public class ParenthesesDiv1EasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		String s = ")(";
		assertArrayEquals(new int[] {0, 0, 1, 1 }, new ParenthesesDiv1Easy().correct(s));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String s = "))))))((((((";
		assertArrayEquals(new int[] {0, 5, 6, 11 }, new ParenthesesDiv1Easy().correct(s));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String s = "))()())()";
		assertArrayEquals(new int[] {-1 }, new ParenthesesDiv1Easy().correct(s));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String s = ")()(((";
		assertArrayEquals(new int[] {0, 0, 3, 3, 5, 5 }, new ParenthesesDiv1Easy().correct(s));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String s = "()";
		assertArrayEquals(new int[] { }, new ParenthesesDiv1Easy().correct(s));
	}
}
