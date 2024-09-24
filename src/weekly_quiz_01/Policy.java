package weekly_quiz_01;

public class Policy {

    final static int FIRST_DISCOUNT_STEP = 3;
    final static int FIRST_STEP_CHARGE = 1000;
    final static int SECOND_DISCOUNT_STEP = 10;
    final static int SECOND_STEP_CHARGE = 5000;
    final static int LAST_STEP_CHARGE = 10000;
    final static int DELIVERY_FEE_FREE= 0;
    final static int PRICE_DISCOUNT_FIRST_STEP = 30000;
    final static int PRICE_DISCOUNT_SECOND_STEP = 100000;

    public static int chargeForWeight(int totalWeight) {
        int Charge;
        if(totalWeight < FIRST_DISCOUNT_STEP){
            Charge = FIRST_STEP_CHARGE;
        }else if(totalWeight< SECOND_DISCOUNT_STEP) {
            Charge = SECOND_STEP_CHARGE;
        }else {
            Charge = LAST_STEP_CHARGE;
        }
        return Charge;
    }
}
