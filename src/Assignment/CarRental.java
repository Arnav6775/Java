package Assignment;

// Q3: CarRental class
public class CarRental {

    private int carId;
    private String carType;
    private float rent;

    // GetCar() method to accept CarId and CarType
    public void getCar(int carId, String carType) {
        this.carId = carId;
        this.carType = carType;
        this.rent = getRent();
    }

    // GetRent() method returns rent based on car type
    public float getRent() {
        switch (carType.toLowerCase()) {
            case "small car": return 1000;
            case "van":       return 800;
            case "suv":       return 2500;
            default:          return 0;
        }
    }

    // ShowCar() method to display car details
    public void showCar() {
        System.out.println("Car ID   : " + carId);
        System.out.println("Car Type : " + carType);
        System.out.println("Rent     : Rs. " + rent);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        CarRental c1 = new CarRental();
        c1.getCar(101, "Small Car");
        c1.showCar();

        CarRental c2 = new CarRental();
        c2.getCar(102, "Van");
        c2.showCar();

        CarRental c3 = new CarRental();
        c3.getCar(103, "SUV");
        c3.showCar();
    }
}
