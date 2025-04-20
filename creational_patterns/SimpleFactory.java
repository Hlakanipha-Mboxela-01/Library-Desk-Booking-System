// SimpleFactory.java

public class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "truck":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}

interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Driving a car");
    }
}

class Bike implements Vehicle {
    public void drive() {
        System.out.println("Riding a bike");
    }
}

class Truck implements Vehicle {
    public void drive() {
        System.out.println("Driving a truck");
    }
}
