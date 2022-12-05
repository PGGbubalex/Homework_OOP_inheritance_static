package Transport;

public final class Bus extends Transport {


    public Bus(String brand, String model, int yearOfRelease, String country, String color, int maxSpeed, String fuelType, float fuelPercentage) {
        super(brand, model, yearOfRelease, country, color, maxSpeed, fuelType, fuelPercentage);
    }

    @Override
    public void refill() {
        System.out.println("Заправбте " + getFuelType() + " на заправке");
        setFuelPercentage(100f);
    }
}
