package chapter10.inherit_generic;

public class InheritGenericExample {
    public static void main(String[] args) {
        ChildProduct<Tv,Integer,String> cp
                = new ChildProduct<>(new Tv(),1231231,"four");


    }
}
