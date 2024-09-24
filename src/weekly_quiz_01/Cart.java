package weekly_quiz_01;

import java.math.BigDecimal;

public class Cart{
    Product[] products;
    int totalWeight;
    int totalPrice;
    int discount;

    public Cart(Product[] products){
        this.products=products;
        for (Product product : products) {
            this.totalWeight += product.weight;
            this.totalPrice += product.price;
            this.discount += product.getDiscountAmount();
            this.totalPrice -= this.discount;
        }
    }

    public int calculateDeliveryCharge() {

        int deliveryCharge;

        // 무게에 따른 배송비 반환
        deliveryCharge = Policy.chargeForWeight(totalWeight);

        // 할인이 적용된 가격에 따른 배송비용 추가 계산
        if(Policy.PRICE_DISCOUNT_FIRST_STEP <= this.totalPrice && Policy.PRICE_DISCOUNT_SECOND_STEP> this.totalPrice){
            deliveryCharge-= Policy.FIRST_STEP_CHARGE;
        } else if(this.totalPrice >= Policy.PRICE_DISCOUNT_SECOND_STEP) {
            deliveryCharge = Policy.DELIVERY_FEE_FREE;
        }

        return deliveryCharge;
    }
}
