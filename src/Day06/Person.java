package Day06;

// use final keyword - 변수를 선언할 때 혹은 생성자에서 초기화 해야 됨.
public class Person {
    final String nation;        // 필드 생성시 초기화 하지 않음
    String name;

    Person(String nation, String name) {
        this.name=name;
        this.nation=nation;     // 생성자에서 final변수 초기화.
    }
}
