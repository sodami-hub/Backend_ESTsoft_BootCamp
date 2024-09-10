package weekly_quiz_01;

public class Product implements Promotion{

    public String name;
    public int price;
    public int weight;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price= price;
        this.weight=weight;
    }

    @Override
    public int getDiscountAmount() {
        if(this instanceof Beauty) {
            return 10000;
        } else if(this instanceof Grocery){
            return 2000;
        }
        return 0;
    }
}
