package chapter08.poly;

public class ProfileMemoryRepository implements ProfileRepository{
    @Override
    public void save() {
        System.out.println("메모리에 프로필 저장하는 기능");
    }
}
