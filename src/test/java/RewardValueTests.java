import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RewardValueTests {

    private static final double MILES_TO_CASH_RATE = 0.0035;

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / MILES_TO_CASH_RATE;
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCash = milesValue * MILES_TO_CASH_RATE;
        assertEquals(expectedCash, rewardValue.getCashValue());
    }
}
