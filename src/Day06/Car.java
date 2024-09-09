package Day06;

import javax.imageio.stream.ImageInputStream;
import java.io.Serializable;

public class Car { // convention : 첫글자 대문자, 카멜케이스


    public String company;
    public String model;
    public int maxSpeed;
    
    
    public Car() {                          // 기본 생성자
        System.out.println("생성자 호출");
    }
    
    public Car(String company, String model, int maxSpeed) {   // 생성자 오버로딩
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public static void main(String[] args) {
        Car car1 = new Car(); // Car 클래스 객체 생성 - 기본 생성자..
        
        Car car2 = new Car("kia", "sorento",200);  // 생성자 오버로딩...
        System.out.println("car2 = " + car2);
        
    }
}
