import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeStringsTest {
	
	@Test(timeout=2000)
	public void test0() {
		long x = 2L;
		long y = 1L;
		int k = 1;
		assertEquals(2L, new PrimeStrings().getCount(x, y, k));
	}
	
	@Test(timeout=2000)
	public void test1() {
		long x = 6L;
		long y = 2L;
		int k = 1;
		assertEquals(4L, new PrimeStrings().getCount(x, y, k));
	}
	
	@Test(timeout=2000)
	public void test2() {
		long x = 6L;
		long y = 1L;
		int k = 3;
		assertEquals(6L, new PrimeStrings().getCount(x, y, k));
	}
	
	@Test(timeout=2000)
	public void test3() {
		long x = 31L;
		long y = 6L;
		int k = 2;
		assertEquals(20L, new PrimeStrings().getCount(x, y, k));
	}
	
	@Test(timeout=2000)
	public void test4() {
		long x = 413L;
		long y = 34L;
		int k = 2;
		assertEquals(130L, new PrimeStrings().getCount(x, y, k));
	}
	
	@Test(timeout=2000)
	public void test5() {
		long x = 1000000000L;
		long y = 1000000000L;
		int k = 5;
		assertEquals(1000000000L, new PrimeStrings().getCount(x, y, k));
	}
	
	@Test(timeout=2000)
	public void test6() {
		long x = 549755813602L;
		long y = 8369864093L;
		int k = 5;
		assertEquals(178429547459L, new PrimeStrings().getCount(x, y, k));
	}
}
