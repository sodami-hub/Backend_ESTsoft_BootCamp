package chapter10.limited_wildcard_param;

public class Course<T> {
    private String name;
    private T[] students;

    public Course(String name, int capacity) {
        this.name = name;
        // 타입 파라이터로 배열을 생성할 때는 object로 생성하고 T[]로 캐스팅
        students = (T[])(new Object[capacity]);
    }

    public String getName() {
        return name;
    }

    public T[] getStudents() {
        return students;
    }

    public void add(T t) {
        for(int i =0; i< students.length ; i++) {
            if(students[i] == null) {
                students[i] = t;
                break;
            }
        }
    }
}
