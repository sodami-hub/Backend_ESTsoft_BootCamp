package chapter13.methodchaining;

public class ChainingExample {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();  // 객체를 하나 생성해두고.

        // 메소드 체이닝을 통해서 미리 만들어둔 객체로부터 객체를 생성한다.
        Pizza cheeseCrust = pizza.dough("치즈크러스트").source("소스많이").topping("고구마");

        System.out.println(pizza.dough);
        System.out.println(cheeseCrust.dough);

    }
}


class Pizza {
    String topping;
    String source;
    String dough;

    // Pizza(String topping, )

    Pizza topping(String topping) {
        this.topping=topping;
        return this;
    }

    Pizza source(String source) {
        this.source=source;
        return this;
    }

    Pizza dough(String dough) {
        this.dough=dough;
        return this;
    }

}
