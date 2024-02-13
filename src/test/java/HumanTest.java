import org.example.refactored.Human;
import org.example.refactored.HumanFactory;
import org.example.refactored.errors.HumanException;
import org.example.refactored.utils.HumanUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HumanTest {


    @Test
    public void testBothArgumentAreNegative() {
        assertThrows(HumanException.class, () -> HumanFactory.getInstance(-1d, -1d));
    }

    @Test
    public void testOneArgumentIsNegative() {
        assertThrows(HumanException.class, () -> HumanFactory.getInstance(-1d, 10d));
    }

    @Test
    public void testOneArgumentIsZero() {
        assertThrows(HumanException.class, () -> HumanFactory.getInstance(10d, 0d));
    }

    @Test
    public void testBothArgumentAreZero() {
        assertThrows(HumanException.class, () -> HumanFactory.getInstance(0d, 0d));
    }

    @Test
    public void testOneArgumentIsNegativeSecondOneZero() {
        assertThrows(HumanException.class, () -> HumanFactory.getInstance(-1d, 0d));
    }

    @Test
    public void testHeightIs20AndWeightIs20() {
        Human human = HumanFactory.getInstance(20d, 20d);

        double expectedImb = 0.05d;
        double actualImb = HumanUtil.getBodyMassIndex(human);

        assertEquals(expectedImb, actualImb);

        String expectedAnalytics = "Deficit";
        String actualAnalytics = HumanUtil.getAnalytics(human);

        assertEquals(expectedAnalytics, actualAnalytics);
    }

    @Test
    public void testHeightIs180AndWeightIs90() {
        Human human = HumanFactory.getInstance(90d, 1.80d);

        double expectedImb = 27.777777777777775;
        double actualImb = HumanUtil.getBodyMassIndex(human);

        assertEquals(expectedImb, actualImb);

        String expectedAnalytics = "Warning!";
        String actualAnalytics = HumanUtil.getAnalytics(human);

        assertEquals(expectedAnalytics, actualAnalytics);
    }


    @Test
    public void testHeightIs180AndWeightIs60() {
        Human human = HumanFactory.getInstance(60d, 1.80d);

        double expectedImb = 18.51851851851852;
        double actualImb = HumanUtil.getBodyMassIndex(human);

        assertEquals(expectedImb, actualImb);

        String expectedAnalytics = "Norm";
        String actualAnalytics = HumanUtil.getAnalytics(human);

        assertEquals(expectedAnalytics, actualAnalytics);
    }


    // And other tests
}
