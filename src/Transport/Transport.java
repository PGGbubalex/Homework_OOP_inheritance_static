package Transport;

public abstract class Transport {

    private String brand;
    private String model;
    private int yearOfRelease;
    private String country;
    private String color;
    private int maxSpeed;
    private String fuelType;
    private float fuelPercentage;

    public Transport(String brand, String model, int yearOfRelease, String country, String color, int maxSpeed, String fuelType, float fuelPercentage) {

        this.brand = ValidateUtil.validateString(brand);
        this.model = ValidateUtil.validateString(model);
        this.yearOfRelease = ValidateUtil.validateYear(yearOfRelease);
        this.country = ValidateUtil.validateString(country);
        this.color = ValidateUtil.validateString(color);
        this.maxSpeed = ValidateUtil.validateNum(maxSpeed);
        this.fuelPercentage = ValidateUtil.validateFuel(fuelPercentage);
        this.fuelType = ValidateUtil.validateString(fuelType);

    }

    public Transport(String brand, String model, int yearOfRelease) {
        this.brand = ValidateUtil.validateString(brand);
        this.model = ValidateUtil.validateString(model);
        this.yearOfRelease = ValidateUtil.validateYear(yearOfRelease);
    }

    public String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        this.brand = ValidateUtil.validateString(brand);
    }

    public String getModel() {
        return model;
    }

    public final void setModel(String model) {
        this.model = ValidateUtil.validateString(model);
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }


    public String getCountry() {
        return country;
    }


    public String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = ValidateUtil.validateString(color);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public final void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = ValidateUtil.validateNum(maxSpeed);
    }

    public final void setFuelPercentage(float fuelPercentage) {
        this.fuelPercentage = ValidateUtil.validateFuel(fuelPercentage);
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public String getFuelType() {
        return fuelType;
    }

    public final void setFuelType(String fuelType) {
        this.fuelType = ValidateUtil.validateString(fuelType);
    }

    public abstract void refill();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuelType='" + fuelType + '\'' +
                ", fuelPercentage=" + fuelPercentage +
                '}';
    }
}

