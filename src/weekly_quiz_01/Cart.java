package weekly_quiz_01;

import java.math.BigDecimal;

public class Cart{
    Product[] products;
    BigDecimal totalWeight = new BigDecimal(0);
    BigDecimal totalPrice = new BigDecimal(0);
    BigDecimal discount = new BigDecimal(0);

    public Cart(Product[] products){
        this.products=products;
        for (Product product : products) {
            this.totalWeight = totalWeight.add(product.getWeight());
            this.totalPrice= totalPrice.add(product.getPrice());
            this.discount = discount.add(product.getDiscountAmount());
        }
    }

    public BigDecimal calculateDeliveryCharge() {
        // 최종 결재금액 구하기(전체금액 - 프로모션 할인)
        this.totalPrice = totalPrice.subtract(discount);
        BigDecimal deliveryCharge;

        // 무게에 따른 배송비 반환
        deliveryCharge = Policy.chargeForWeight(totalWeight);

        // 할인이 적용된 가격에 따른 배송비용 추가 계산
        if(totalPrice.compareTo(Policy.PRICE_DISCOUNT_FIRST_STEP) > 0
                    && totalPrice.compareTo(Policy.PRICE_DISCOUNT_SECOND_STEP) <0) {
            deliveryCharge = deliveryCharge.subtract(Policy.FIRST_STEP_CHARGE);
        } else if(this.totalPrice.compareTo(Policy.PRICE_DISCOUNT_SECOND_STEP) >0) {
            deliveryCharge = Policy.DELIVERY_FEE_FREE;
        }

        return deliveryCharge;
    }
}
