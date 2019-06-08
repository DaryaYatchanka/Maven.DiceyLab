import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void incrementBin() {
        Bins bin = new Bins(2,12);


        int actual = bin.getBin(3);
        int expected =  0;

        Assert.assertEquals(actual, expected);
    }
}
