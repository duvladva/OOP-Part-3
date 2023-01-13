public class Transport {
    public final String brand;
    public final String model;
    public String color; // изменяемый параметр
    public final int productionYear; // не изменяемый параметр
    public final String productionCountry; // не изменяемый параметр
    public Integer maxSpeedRide; // изменяемый параметр

    public Transport(String brand, String model, String color, int productionYear, String productionCountry, Integer maxSpeedRide) {
        this.brand = brand;
        this.model = model;

        if (color == null || color.isBlank()) {
            this.color = "default";
        } else {
            this.color = color;
        }

        this.productionYear = productionYear;
        this.productionCountry = productionCountry;

        if (maxSpeedRide == null || maxSpeedRide < 0) {
            this.maxSpeedRide = 0;
        } else {
            this.maxSpeedRide = maxSpeedRide;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public Integer getMaxSpeedRide() {
        return maxSpeedRide;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = "default";
        } else {
            this.color = color;
        }
    }

    public void setMaxSpeedRide(Integer maxSpeedRide) {
        if (maxSpeedRide == null || maxSpeedRide <= 0) {
            System.out.println("Введите корректное значение максимальной скорости");
        } else {
            this.maxSpeedRide = maxSpeedRide;
        }


    }
}
