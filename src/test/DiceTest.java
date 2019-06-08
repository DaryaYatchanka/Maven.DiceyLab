import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void tossAndSumTest() {
        Dice dice = new Dice(2);
        Boolean allGood = true;

        Integer actual = dice.tossAndSum();
        Assert.assertTrue(actual >=2 &&actual<=12);



    }
}