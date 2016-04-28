import org.junit.Test;
import static org.junit.Assert.*;

public class ParenthesesDiv1MediumTest {
	
	@Test(timeout=2000)
	public void test0() {
		String s = ")(";
		int[] L = new int[] {0,0,0,0};
		int[] R = new int[] {1,1,1,1};
		assertEquals(1, new ParenthesesDiv1Medium().minSwaps(s, L, R));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String s = "(())";
		int[] L = new int[] {0,2};
		int[] R = new int[] {1,3};
		assertEquals(1, new ParenthesesDiv1Medium().minSwaps(s, L, R));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String s = "(((())";
		int[] L = new int[] {0,2};
		int[] R = new int[] {1,3};
		assertEquals(2, new ParenthesesDiv1Medium().minSwaps(s, L, R));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String s = "(((((((((";
		int[] L = new int[] {0,2};
		int[] R = new int[] {1,3};
		assertEquals(-1, new ParenthesesDiv1Medium().minSwaps(s, L, R));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String s = "()()()()";
		int[] L = new int[] {0,0,0,0,2,2,2,4,4,6};
		int[] R = new int[] {1,3,5,7,3,5,7,5,7,7};
		assertEquals(0, new ParenthesesDiv1Medium().minSwaps(s, L, R));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String s = ")()(()()((())()()()()()()))(()())()()()(";
		int[] L = new int[] {3,5,17,25,35};
		int[] R = new int[] {12,10,30,30,38};
		assertEquals(3, new ParenthesesDiv1Medium().minSwaps(s, L, R));
	}
}
