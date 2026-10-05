package Practice;

public class Car {
    private String plateNumber;
    private String carModel;
    private double dailyRate;
    private boolean rent;
    private static String companyName = "JUST Rentals";
    private static int totalCars = 0;

    public Car() {
        this.plateNumber = "Unknown";
        this.carModel = "Unknown";
        this.dailyRate = 0.0;
        this.rent = false;

        totalCars++;
    }

    public Car(String plateNumber, String model, double dailyRate) {
        this.plateNumber = plateNumber;
        this.carModel = model;
        this.dailyRate = dailyRate;
        this.rent = false;

        totalCars++;
    }

    // Getters
    public String getPlateNumber() {
        return plateNumber;
    }

    public String getModel() {
        return carModel;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isRented() {
        return rent;
    }

    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

    public static void displayTotalCars() {
        System.out.println("Total Cars: " + totalCars);
    }

    // Setter
    public void setDailyRate(double rate) {
        this.dailyRate = rate;
    }

    public void rent() {
        rent = true;
    }

    public void returnCar() {
        rent = false;
    }

    public void displayInfo() {
        System.out.println("==== CAR INFO ====");
        System.out.println("\tPlate Number: " + plateNumber);
        System.out.println("\tModel: " + carModel);
        System.out.println("\tDaily Rate: " + dailyRate);
        System.out.println("\tRented: " + rent);
        System.out.println("\tCompany: " + companyName);
        System.out.println("==================");
    }
}


class TestCar {

    public static void main(String[] args) {

        Car car1 = new Car("A123", "Toyota", 50);
        Car car2 = new Car("B456", "Honda", 40);

        Car.displayCompanyName();

        car1.displayInfo();
        car2.displayInfo();

        System.out.println("After renting car1:");
        car1.rent();
        car1.displayInfo();

        System.out.println("After returning car1:");
        car1.returnCar();
        car1.displayInfo();
        Car.displayTotalCars();
    }
}