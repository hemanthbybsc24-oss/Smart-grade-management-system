interface Vehicle {
    void start();
    default void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started with ignition key.");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started with self-start button.");
    }

    public void stop() {
        System.out.println("Bike stopped safely.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v1.stop();  

        v2.start();
        v2.stop();   
    }
}