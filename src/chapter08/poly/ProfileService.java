package chapter08.poly;

public class ProfileService {
    ProfileRepository repository;

    public void saveProfile() {
        // repository의 인스턴스를 바꿔주면 전혀 다른 코드를 실행할 수 있다.
        repository = new ProfileDBRepository();
        repository.save();
    }
    // 또는 매개변수를 인터페이스로 주면 매개변수의 인스턴스에 따라서 실행이 달라진다.
    public void saveProfile02(ProfileRepository repository) {
        repository.save();
    }
}
