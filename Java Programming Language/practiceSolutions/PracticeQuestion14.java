package practiceSolutions;

public class PracticeQuestion14 {
    protected String drive() {
        return "Driving vehicle";
    }

    public static void main(String[] args) {
        PracticeQuestion14 vehicle = new ElectricCar();
        System.out.print(vehicle.drive());
    }
}

class Car extends PracticeQuestion14 {
    @Override
    protected String drive() {
        return "Driving car";
    }
}

class ElectricCar extends Car {
    @Override
    public final String drive() {
        return "Driving electric car";
    }
}

