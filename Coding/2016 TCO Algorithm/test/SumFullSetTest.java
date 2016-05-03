import org.junit.Test;

import static org.junit.Assert.*;

public class SumFullSetTest {

    @Test(timeout = 200000000)
    public void test0() {
        int[] elements = new int[]{-1, 0, 1};
        assertEquals("closed", new SumFullSet().isSumFullSet(elements));
    }

    @Test(timeout = 2000)
    public void test1() {
        int[] elements = new int[]{-1, 1};
        assertEquals("not closed", new SumFullSet().isSumFullSet(elements));
    }

    @Test(timeout = 2000)
    public void test2() {
        int[] elements = new int[]{0, 1};
        assertEquals("closed", new SumFullSet().isSumFullSet(elements));
    }

    @Test(timeout = 2000)
    public void test3() {
        int[] elements = new int[]{0, 1, 1};
        assertEquals("not closed", new SumFullSet().isSumFullSet(elements));
    }

    @Test(timeout = 2000)
    public void test4() {
        int[] elements = new int[]{16, 0, 43, 43, -36, -49, -46, -16, 40, 34, -43, -24, 13, -48, 45, 19, 12, 0, 43, 6, 26, -23, 50, 28, -3, 21, 46, 45, -32, -41, 0, -27, 42, 19, 47, -36, -21, -1, 5, -21, -28, -43, 23, -26, -5, 21, -41, 16, -37, 38};
        assertEquals("not closed", new SumFullSet().isSumFullSet(elements));
    }

    @Test(timeout = 2000)
    public void test5() {
        int[] elements = new int[]{10};
        assertEquals("closed", new SumFullSet().isSumFullSet(elements));
    }
}
