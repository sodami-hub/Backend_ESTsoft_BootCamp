package chapter08.interface_exam02;

public class VehicleExample {
    public static void main(String[] args) {
        Bus b = new Bus();
        b.run();

        Taxi t = new Taxi();
        t.run();

        Vehicle v = new Taxi();

        Driver d = new Driver();
        d.drive(v);
    }
}
