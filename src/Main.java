public class Main {
    public static void main(String[] args) {// создаем объектs класса Car с определенными значениями параметров
        Car lada = new Car("Lada","Vesta", 1.7, "white",2015, "Russia", "hand",
                "sedan", 123, 4, false, true, true, 200);
//
//        Car audi = new Car("Audi","",3.0, "black", 2020, "Germany", "auto",
//                "sedan", 234, 4, false, true, true, 240);
//
//        Car bmv = new Car("BMV", "BMV Z8", -1.0, "black",2021,"Germany",
//                "автоматическая", "седан", 345, 4, false, true, true, 180);
//
//        Car kia = new Car("Kia", "Kia Sportage 4 generation", -10.0,"red", 2018 ,
//                "South Korea", "ручная", "седан", 456, 4,
//                false, true, true, 185);
//
//        Car hyundai = new Car("Hyundai","Hyundai Avante", 1.6, "orange", 2016,
//                "South Korea", "ручная", "седан", 567, 4,
//                false, true, true, 225);

        System.out.println("Создаем объекты класса Car с определенными значениями параметров:");
        System.out.println(lada); // вывод в консоль тех параметров объекта, которые определены в методе toString
//        System.out.println(audi);
//        System.out.println(bmv);
//        System.out.println(kia);
//        System.out.println(hyundai);

//        System.out.println();
//        System.out.println("Для объекта Lada проверяем значение параметра Brand, вызываем геттер getBrand() = " + lada.getBrand());
//
//        System.out.println();
//        System.out.println("Для объекта Lada проверяем значение параметра Model, вызываем геттер getModel() = " + lada.getModel());

//        System.out.println();
//        System.out.println("Для объекта Lada проверяем значение параметра EngineVolume, вызываем геттер getEngineVolume() = " + lada.getEngineVolume());
//        lada.setEngineVolume(4.0); //  для объекта lada вызывается сеттер параметра EngineVolume и параметру присваивается значение 4.0
//        System.out.println("Для объекта Lada сеттером установлено значение параметра EngineVolume = 4.0. Проверяем, EngineVolume = " + lada.getEngineVolume());

//        System.out.println();
//        System.out.println("Для объекта Lada проверяем значение параметра Color, вызываем геттер getColor() = " + lada.getColor());
//        lada.setColor("фиолетовый"); //  для объекта lada вызывается сеттер параметра Color и параметру присваивается значение фиолетовый
//        System.out.println("Для объекта Lada сеттером установлено значение параметра Color = \"фиолетовый\". Проверяем, EngineVolume = " + lada.getColor());

//        System.out.println();
//        System.out.println("Для объекта Lada проверяем значение параметра ProductionYear, вызываем геттер getProductionYear() = " + lada.getProductionYear());

//        System.out.println();
//        System.out.println("Для объекта Lada проверяем значение параметра ProductionCountry, вызываем геттер getProductionCountry() = " + lada.getProductionCountry());
//
//        System.out.println();
//        System.out.println("Для объекта Lada проверяем значение параметра Transmission, вызываем геттер getTransmission() = " + lada.getTransmission());
//        lada.setTransmission("автоматическая"); //  для объекта lada вызывается сеттер параметра Transmission и параметру присваивается значение "автоматическая""
//        System.out.println("Для объекта Lada сеттером установлено значение параметра Transmission = \"автоматическая\". Проверяем, Transmission = " + lada.getTransmission());
//
//        System.out.println();
//        System.out.println("Для объекта Lada проверяем значение параметра BodyTypes, вызываем геттер getBodyTypes() = " + lada.getBodyTypes());
//
//        System.out.println();
//        System.out.println("Для объекта Lada проверяем значение параметра RegistrationNumber, вызываем геттер getRegistrationNumber() = " + lada.getRegistrationNumber());
//        lada.setRegistrationNumber(999); //  для объекта lada вызывается сеттер параметра RegistrationNumber и параметру присваивается значение 999
//        System.out.println("Для объекта Lada сеттером установлено значение параметра RegistrationNumber = 999. Проверяем, RegistrationNumber = " + lada.getRegistrationNumber());

//        System.out.println();
//        System.out.println("Для объекта Lada проверяем значение параметра SeatsCount, вызываем геттер getSeatsCount() = " + lada.getSeatsCount());
//
//        System.out.println();
//        System.out.println("Для объекта Lada проверяем значение параметра SummerTyres, вызываем геттер getSummerTyres() = " + lada.getSummerTyres());
//        lada.setSummerTyres(true); //  для объекта lada вызывается сеттер параметра summerTyres и параметру присваивается значение true
//        System.out.println("Для объекта Lada сеттером установлено значение параметра summerTyres = true. Проверяем, SummerTyres = " + lada.getSummerTyres());
//        lada.changeTyres(2); //  для объекта lada вызывается метод changeTyres и параметру присваивается значение 2
//        System.out.println("Для объекта Lada методом changeTyres установлено значение параметра summerTyres = false. Проверяем, SummerTyres = " + lada.getSummerTyres());
//
//        System.out.println();
//        lada.setKey(false, false);
//        System.out.println("Для объекта Lada сеттером объекта Кеу установлено значение параметров remoteEngineStart = false, nonKeyAccess = false. Проверяем: " );
//        System.out.println(lada);
//
//        System.out.println();
//        System.out.println("Для объекта Lada проверяем значение параметра MaxSpeedRide, вызываем геттер getMaxSpeedRide() = " + lada.getMaxSpeedRide());
//        lada.setMaxSpeedRide(333); //  для объекта lada вызывается сеттер параметра RegistrationNumber и параметру присваивается значение 333
//        System.out.println("Для объекта Lada сеттером установлено значение параметра MaxSpeedRide = 333. Проверяем, MaxSpeedRide = " + lada.getMaxSpeedRide());

        System.out.println("Создаем объекты класса Bus с определенными значениями параметров:");
        Bus Daewoo = new Bus("Daewoo", "mod001", "yellow", 2011, "S.Korea", 140);
        Bus Mersedes = new Bus("Mersedes", "mod002", "blue", 2005, "Germany", 200);
        Bus Paz = new Bus("PAZ", "mod003", "white", 2012, "Russia", 130);

        System.out.println(Daewoo); // вывод в консоль тех параметров объекта, которые определены в методе toString
        System.out.println(Mersedes); // вывод в консоль тех параметров объекта, которые определены в методе toString
        System.out.println(Paz); // вывод в консоль тех параметров объекта, которые определены в методе toString
    }
}