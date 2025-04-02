public class Main {
    public static void main(String[] args) {
//        Bus bus = new Bus(0.300);
//        bus.refuel(100);
//        System.out.println("Автобус:");
//        System.out.println("Осталось " + bus.getTankFullnessRate() + " л топлива");
//        System.out.println("На " + bus.drivingDistance() + " км хватит топлива :)");
//        System.out.println("Едем 310 км: " + bus.run(310));
//        System.out.println("Осталось " + bus.getTankFullnessRate() + " л топлива");
//        System.out.println("На " + bus.drivingDistance() + " км хватит топлива :)");
//        System.out.println("Едем ещё 5 км: " + bus.run(5));
//        System.out.println("Осталось " + bus.getTankFullnessRate() + " л топлива");
//        System.out.println("На " + bus.drivingDistance() + " км хватит топлива :)");
//
//        ElectricBus electricBus = new ElectricBus(0.300, 9.5);
//        electricBus.refuel(100);
//        System.out.println("\nЭлектробус:");
//        System.out.println("Осталось " + electricBus.getTankFullnessRate() + " единиц заряда!");
//        System.out.println("На " + electricBus.drivingDistance() + " км хватит топлива :)");
//        System.out.println("Едем 310 км: " + electricBus.run(310));
//        System.out.println("Осталось " + electricBus.getTankFullnessRate() + " единиц заряда!");
//        System.out.println("На " + electricBus.drivingDistance() + " км хватит топлива :)");
//        System.out.println("Едем ещё 5 км: " + electricBus.run(5));
//        System.out.println("Осталось " + electricBus.getTankFullnessRate() + " единиц заряда!");
//        System.out.println("На " + electricBus.drivingDistance() + " км хватит топлива :)");

        Bus firstBus = new Bus(0.300);
        Bus secondBus = new Bus(0.300);
        Bus thirdBus = new Bus(0.300);

        ElectricBus firstElectricBus = new ElectricBus(0.300, 9.5);
        ElectricBus secondElectricBus = new ElectricBus(0.300, 9.5);

        System.out.println("Кол-во всех автобусов: " + Bus.getCount());
        System.out.println("Кол-во всех электробусов: " + ElectricBus.getCount());
    }
}
