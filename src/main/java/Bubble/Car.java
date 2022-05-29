package Bubble;

public class Car implements Vehicle {

    @Override
    public void porneste() {
        System.out.println("Masina se porneste");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.opreste();
        car.porneste();
        car.frineaza();
    }
}
