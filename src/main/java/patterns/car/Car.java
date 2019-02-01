package patterns.car;

abstract public class Car {
    private double engineCapacity;
    private String fuelType;
    private int productionYear;
    private String steeringWheel;

    Car(double engineCapacity, String fuelType, int productionYear, String steeringWheel) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.productionYear = productionYear;
        this.steeringWheel = steeringWheel;
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineCapacity=" + engineCapacity +
                ", fuelType='" + fuelType + '\'' +
                ", productionYear=" + productionYear +
                ", steeringWheel='" + steeringWheel + '\'' +
                '}';
    }
}
