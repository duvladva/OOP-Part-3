public class Bus extends Transport {

    public Bus(String brand, String model, String color, int productionYear, String productionCountry, Integer maxSpeedRide) {
        super(brand, model, color, productionYear, productionCountry, maxSpeedRide);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", maxSpeedRide=" + maxSpeedRide +
                '}';
    }
}
