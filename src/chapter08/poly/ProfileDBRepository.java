package chapter08.poly;

public class ProfileDBRepository implements ProfileRepository{
    @Override
    public void save() {
        System.out.println("DB에 프로필을 저장하는 기능");
    }
}
