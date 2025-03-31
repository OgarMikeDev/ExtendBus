public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(0.010);
        bus.refuel(1);
        System.out.println("Обычный автобус:");
        System.out.println("На " + bus.powerReserve() + " км хватит топлива");
        System.out.println("Едем ещё 95 км: " + bus.run(95));
        System.out.println("На " + bus.powerReserve() + " км хватит топлива");
        System.out.println("Едем ещё 2 км: " + bus.run(2));
        System.out.println("На " + bus.powerReserve() + " км хватит топлива\n");

        ElectricBus electricBus = new ElectricBus(0.010, 0.100);
        electricBus.refuel(1);
        System.out.println("Электробус автобус:");
        System.out.println("На " + electricBus.powerReserve() + " км хватит электричества");
        System.out.println("Едем ещё 95 км: " + electricBus.run(95));
        System.out.println("На " + electricBus.powerReserve() + " км хватит электричества");
        System.out.println("Едем ещё 2 км: " + electricBus.run(2));
        System.out.println("На " + electricBus.powerReserve() + " км хватит электричества\n");
    }
}
