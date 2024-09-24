package weekly_quiz_01;

import java.math.BigDecimal;

public class WeeklyQuizMain {
    public static void main(String[] args) {
        Product beauty = new Beauty("beauty", BigDecimal.valueOf(30_000), BigDecimal.valueOf(2));
        Product grocery = new Grocery("grocery", BigDecimal.valueOf(20_000), BigDecimal.valueOf(3));
        Product largeAppliance = new LargeAppliance("largeAppliance", BigDecimal.valueOf(50_000), BigDecimal.valueOf(5));

        Cart cart = new Cart(new Product[] {beauty, grocery, largeAppliance});
        BigDecimal totalDeliveryCharge = cart.calculateDeliveryCharge();
        System.out.println("최종 배송 비용 : " +totalDeliveryCharge);    // 결과: 9000
    }
}
