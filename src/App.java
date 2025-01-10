public class App {
    public static void main(String[] args) throws Exception {
        // Object oriented programming
        // Class
        // Object c1 kieu Car
        Car myCar = new Car();
        Car c2 = new Car("Toyota", "red", "Cross", 2023);
        System.out.println(myCar);
        myCar.brake();
    }

}

class Car {
    // Fields
    String company;
    String model;
    int year;
    String color;

    // Constructor
    public Car() {
        this.company = "BMW";
        this.color = "White";
        this.model = "W6";
        this.year = 2024;
    }

    public Car(String company, String color, String model,
            int year) {
        this.company = company;
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Methods
    public void brake() {
        System.out.print("The car is braking");
    }
}
