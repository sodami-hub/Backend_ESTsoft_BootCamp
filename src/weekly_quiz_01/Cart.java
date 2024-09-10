package weekly_quiz_01;

public class Cart{
    Product[] products;

    public Cart(Product[] products){
        this.products=products;
    }

    public int calculateDeliveryCharge() {
        int totalWeight =0;
        int totalMoney = 0;
        int discount = 0;
        int result = 0;

        for (Product product : products) {
            totalWeight += product.weight;
            totalMoney += product.price;
            discount += product.getDiscountAmount();
        }

        if(totalWeight < 3){
            result = 1000;
        }else if(totalWeight<10) {
            result = 5000;
        }else {
            result = 10000;
        }

        System.out.println("배송비용 : " + result);
        System.out.println("전체 금액 : "+totalMoney);
        System.out.println("할인 금액 : "+discount);

        totalMoney -= discount;


        if(30000 <= totalMoney && 100000>totalMoney){
            result-=1000;
        } else if(totalMoney >= 100000) {
            result = 0;
        }

        return result;
    }
}
