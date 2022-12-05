package Transport;

public final class Train extends Transport {

    private int price;
    private int travelTime;
    private String firstStation;
    private String finalStop;
    private int numberOfWagons;

    public Train(int yearOfRelease, String country, int price, String firstStation, String finalStop, int numberOfWagons, String model, String brand) {

        super(model, brand, yearOfRelease);

        this.price = ValidateUtil.validateNum(price);
        this.travelTime = ValidateUtil.validateNum(travelTime);
        this.firstStation = ValidateUtil.validateString(firstStation);
        this.finalStop = ValidateUtil.validateString(finalStop);
        this.numberOfWagons = ValidateUtil.validateNum(numberOfWagons);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = ValidateUtil.validateNum(price);
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = ValidateUtil.validateNum(travelTime);
    }

    public String getFirstStation() {
        return firstStation;
    }

    public void setFirstStation(String firstStation) {
        this.firstStation = ValidateUtil.validateString(firstStation);
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = ValidateUtil.validateString(finalStop);
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = ValidateUtil.validateNum(numberOfWagons);
    }

    public void refill() {
        System.out.println("Заправьте " + getFuelType());
        setFuelPercentage(100f);

    }


    @Override
    public String toString() {
        return "Train{" +
                "model " + getModel() + "country " + getCountry() + "year ="+ getYearOfRelease() + "price=" + price + ", travelTime=" + travelTime + ", firstStation='" + firstStation + '\'' + ", finalStop='" + finalStop + '\'' + ", numberOfWagons=" + numberOfWagons + '}';
    }
}
