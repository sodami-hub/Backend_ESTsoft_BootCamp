package chapter12.constructorlamdba;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
    private String name;
    private String id;

    Member(String name) {
        this.name = name;
    }

    Member(String name, String id) {
        this(name);
        this.id = id;
    }



}
