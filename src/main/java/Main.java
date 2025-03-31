public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(0.300);
        bus.refuel(95);
        System.out.println("Обычный автобус:");
        System.out.println("На " + bus.powerReserve() + " км хватит топлива");
        System.out.println("Едем 310 км: " + bus.run(310));
        System.out.println("На " + bus.powerReserve() + " км хватит топлива");
        System.out.println("Едем ещё 5 км: " + bus.run(5));
        System.out.println("На " + bus.powerReserve() + " км хватит топлива\n");

        ElectricBus electricBus = new ElectricBus(0.300, 9.5);
        electricBus.refuel(95);
        System.out.println("На " + electricBus.powerReserve() + " км хватит топлива");
        System.out.println("Едем 310 км: " + electricBus.run(310));
        System.out.println("На " + electricBus.powerReserve() + " км хватит топлива");
        System.out.println("Едем ещё 5 км: " + electricBus.run(5));
        System.out.println("На " + electricBus.powerReserve() + " км хватит топлива\n");
    }
}
