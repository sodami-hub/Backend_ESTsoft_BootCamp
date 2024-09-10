package Day08.interface_exam02;


public class Driver {
    void drive(Vehicle v) {
        switch(v) {
            case Bus b -> System.out.println("instanceOf Bus");
            case Taxi t -> System.out.println("instanceOF Taxi");
            default -> System.out.println(" ");
        }
    }
}
