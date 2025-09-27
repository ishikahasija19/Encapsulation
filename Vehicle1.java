
interface Insurable {

    void calculateInsurance();

    void getInsuranceDetails();
}

class Vehicle {

    private String vehicleId;
    public String driverName;
    public int ratePerKm;

    Vehicle(String vehicleId, String driverName, int ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public void getItemDetails() {
        System.out.println("Vehicle ID " + vehicleId + ", Driver Name: " + driverName + ", rate per km: " + ratePerKm);
    }

    public void calculateFare(double distance) {
        double fare = distance * ratePerKm;
        System.out.println("Vehicle Fare: " + fare);
    }
}

class Car extends Vehicle implements Insurable {

    Car(String vehicleId, String driverName, int ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public void calculateFare(double distance) {
        double fare = distance * ratePerKm;
        System.out.println("Car Fare: " + fare);
    }

    public void calculateInsurance() {
        System.out.println("Car Insurance: " + (ratePerKm * 0.1));
    }

    public void getInsuranceDetails() {
        System.out.println("Car Insurance details: Comprehensive coverage");

    }
}

class Bike extends Vehicle implements Insurable {

    Bike(String vehicleId, String driverName, int ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public void calculateFare(double distance) {
        double fare = distance * ratePerKm;
        System.out.println("Bike Fare: " + fare);
    }

    public void calculateInsurance() {
        System.out.println("Bike Insurance: " + (ratePerKm * 0.05));
    }

    public void getInsuranceDetails() {
        System.out.println("Bike Insurance details: Third-party coverage");
    }
}

class Truck extends Vehicle implements Insurable {

    Truck(String vehicleId, String driverName, int ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public void calculateFare(double distance) {
        double fare = distance * ratePerKm;
        System.out.println("Truck Fare: " + fare);
    }

    public void calculateInsurance() {
        System.out.println("Truck Insurance: " + (ratePerKm * 0.15));
    }

    public void getInsuranceDetails() {
        System.out.println("Truck Insurance details: Full coverage");
    }
}

public class Vehicle1 {

    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("C001", "ram", 10),
            new Bike("B001", "shyam", 5),
            new Truck("T001", "ramu", 15)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.getItemDetails();
            vehicle.calculateFare(100);
            if (vehicle instanceof Insurable) {
                ((Insurable) vehicle).calculateInsurance();
                ((Insurable) vehicle).getInsuranceDetails();
            }
        }
    }
}
