package weekly_quiz_01;

import java.math.BigDecimal;

public class Product implements Promotion{

    private String name;
    private BigDecimal price;
    private BigDecimal weight;

    public Product(String name, BigDecimal price, BigDecimal weight) {
        this.name = name;
        this.price= price;
        this.weight= weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Override
    public BigDecimal getDiscountAmount() {
        BigDecimal discountAmount= BigDecimal.valueOf(0);

        if(this instanceof Beauty) {
            discountAmount = new BigDecimal(10000);
        } else if(this instanceof Grocery){
            discountAmount = new BigDecimal(2000);
        }
        return discountAmount;
    }
}
