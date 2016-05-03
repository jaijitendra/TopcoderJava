import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeProgrammersTest {

    @Test(timeout = 20000000)
    public void test0() {
        String code = "CAB";
        assertEquals("BCA", new ThreeProgrammers().validCodeHistory(code));
    }

    @Test(timeout = 20000000)
    public void test1() {
        String code = "CBB";
        assertEquals("BCB", new ThreeProgrammers().validCodeHistory(code));
    }

    @Test(timeout = 20000000)
    public void test2() {
        String code = "BB";
        assertEquals("impossible", new ThreeProgrammers().validCodeHistory(code));
    }

    @Test(timeout = 20000000)
    public void test3() {
        String code = "BBA";
        assertEquals("BAB", new ThreeProgrammers().validCodeHistory(code));
    }

    @Test(timeout = 20000000)
    public void test4() {
        String code = "CAC";
        assertEquals("impossible", new ThreeProgrammers().validCodeHistory(code));
    }

    @Test(timeout = 20000000)
    public void test5() {
        String code = "ACAC";
        assertEquals("CAAC", new ThreeProgrammers().validCodeHistory(code));
    }

    @Test(timeout = 20000000)
    public void test6() {
        String code = "ACABC";
        assertEquals("ACABC", new ThreeProgrammers().validCodeHistory(code));
    }

    @Test(timeout = 20000000)
    public void test7() {
        String code = "BAABCABBCCACBAACABAABABBCCAACABCCAACCABCACACCBABAB";
        assertEquals("BACBABCAACBACABCBACBACABCBACBACABCABCAACBACAACABCA", new ThreeProgrammers().validCodeHistory(code));
    }
}
