package numeric;

import static numeric.Median.median;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Ignore;

public class MedianTest {

    @Test
    public void midIsFirst() {
        Assert.assertEquals(2, median(2, 1, 3));
    }

    @Test
    public void midIsLast() {
        Assert.assertEquals(2, median(1, 3, 2));
    }
    
    @Test
    public void midIsMiddle() {
        Assert.assertEquals(2, median(1, 2, 3));
    }

    @Ignore
    @Test(timeout=1000)
    public void infiniteLoop() {
        while (true) {}
    }

}
