import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class SumFullSet {

    public String isSumFullSet(int[] elements) {
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        for (int i = 0, len = elements.length; i < len; i++) {
            mpp.put(elements[i], 1);
        }
        for (int i = 0, len = elements.length; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if ((!mpp.containsKey(elements[i] + elements[j])) && i != j) {
                    return "not closed";
                }
            }
        }
        return "closed";
    }
}
