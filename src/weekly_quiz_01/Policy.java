package weekly_quiz_01;

import java.math.BigDecimal;

public class Policy {

    final static BigDecimal FIRST_DISCOUNT_STEP = BigDecimal.valueOf(3);
    final static BigDecimal FIRST_STEP_CHARGE = BigDecimal.valueOf(1_000);
    final static BigDecimal SECOND_DISCOUNT_STEP = BigDecimal.valueOf(10);
    final static BigDecimal SECOND_STEP_CHARGE = BigDecimal.valueOf(5_000);
    final static BigDecimal LAST_STEP_CHARGE = BigDecimal.valueOf(10_000);
    final static BigDecimal DELIVERY_FEE_FREE= BigDecimal.valueOf(0);
    final static BigDecimal PRICE_DISCOUNT_FIRST_STEP = BigDecimal.valueOf(30_000);
    final static BigDecimal PRICE_DISCOUNT_SECOND_STEP =BigDecimal.valueOf(100_000);

    public static BigDecimal chargeForWeight(BigDecimal totalWeight) {
        BigDecimal Charge;
        if(totalWeight.compareTo(FIRST_DISCOUNT_STEP) < 0 ){
            Charge = FIRST_STEP_CHARGE;
        }else if(totalWeight.compareTo(SECOND_DISCOUNT_STEP)  < 0) {
            Charge = SECOND_STEP_CHARGE;
        }else {
            Charge = LAST_STEP_CHARGE;
        }
        return Charge;
    }
}
