
public class Car {
    private String make, model;
    private int year;

    public Car() {}

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Royal";
        car1.year = 2024;
        System.out.println("Car 1 - Make: " + car1.make + ", Model: " + car1.model + ", Year: " + car1.year);

        Car car2 = new Car("Honda", "Bmw", 2023);
        System.out.println("Car 2 - Make: " + car2.make + ", Model: " + car2.model + ", Year: " + car2.year);
    }
}



