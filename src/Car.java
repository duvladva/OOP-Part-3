public class Car extends Transport {
//    private final String brand; //  имеется в Transport
//    private final String model; // имеется в Transport
    private Double engineVolume;
//    private String color;// имеется в Transport
//    private final int productionYear;// имеется в Transport
//    private final String productionCountry;// имеется в Transport
    private String transmission;
    private final String bodyTypes;
    private Integer registrationNumber;
    private final int seatsCount;
    private boolean summerTyres;

    private Key key;



    public Car(String brand, String model, Double engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodyTypes, Integer registrationNumber,
               Integer seatsCount, Boolean summerTyres, boolean remoteEngineStart, boolean nonKeyAccess, Integer maxSpeedRide){

        super(brand, model, color, productionYear, productionCountry, maxSpeedRide);


//        if (brand == null || brand.isBlank()) {
//            this.brand = "default";
//        } else {
//            this.brand = brand;
//        }
//
//        if ( model == null || model.isBlank()) {
//            this.model = "default";
//        } else {
//            this.model = model;


        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

//        if (color == null || color.isBlank()) {
//            this.color = "white";
//        } else {
//            this.color = color;
//        }

//        if (productionYear <= 0) {
//            this.productionYear = 2000;
//        } else {
//            this.productionYear = productionYear;
//        }


//        if (productionCountry == null || productionCountry.isBlank()) {
//            this.productionCountry = "default";
//        } else {
//            this.productionCountry = productionCountry;
//        }


        if (transmission == null || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }

        if (bodyTypes == null || bodyTypes.isBlank()) {
            this.bodyTypes = "default";
        } else {
            this.bodyTypes = bodyTypes;
        }

        if (registrationNumber <= 0) {
            this.registrationNumber = Math.abs(registrationNumber);
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (seatsCount <= 0) {
            this.seatsCount = 4;
        } else {
            this.seatsCount = seatsCount;
        }

        this.summerTyres = summerTyres;

        key = new Key(remoteEngineStart, nonKeyAccess);


    }


    public class Key {
        private final boolean remoteEngineStart;
        private final boolean nonKeyAccess;

        public Key(boolean remoteEngineStart, boolean nonKeyAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.nonKeyAccess = nonKeyAccess;
        }

        @Override
        public String toString() {
            return "key{" +
                    "remoteEngineStart=" + remoteEngineStart +
                    ", nonKeyAccess=" + nonKeyAccess +
                    '}';
        }

    }

//    public String getBrand() {
//        return brand;
//    }

//    public String getModel() {
//        return model;
//    }

    public Double getEngineVolume() {
        return engineVolume;
    }

//    public String getColor() {
//        return color;
//    }

//    public int getProductionYear() {
//        return productionYear;
//    }

//    public String getProductionCountry() {
//        return productionCountry;
//    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyTypes() {
        return bodyTypes;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public Integer getSeatsCount() {
        return seatsCount;
    }

    public boolean getSummerTyres() {
        return summerTyres;
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

//    public void setColor(String color) {
//        if (color.isBlank() || color == null) {
//            this.color = "white";
//        } else {
//            this.color = color;
//        }
//    }

    public void setTransmission(String transmission) {
        if (transmission.isBlank() || transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        if (registrationNumber <= 0) {
            this.registrationNumber = Math.abs(registrationNumber);
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public void changeTyres(int mounth) {
        if (mounth >= 4 && mounth <= 10) {
            setSummerTyres(true);
        } else {
            setSummerTyres(false);
        }
    }

    public void setKey(boolean remoteEngineStart, boolean nonKeyAccess) {
        this.key = new Key(remoteEngineStart, nonKeyAccess);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyTypes='" + bodyTypes + '\'' +
                ", registrationNumber=" + registrationNumber +
                ", seatsCount=" + seatsCount +
                ", summerTyres=" + summerTyres +
                ", key=" + key +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", maxSpeedRide=" + maxSpeedRide +
                '}';
    }


}
