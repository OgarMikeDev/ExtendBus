public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(0.010);
        bus.refuel(1);
        System.out.println("На " + bus.powerReserve() + " км хватит топлива");
        System.out.println("Едем ещё 50 км: " + bus.run(60));
        System.out.println("На " + bus.powerReserve() + " км хватит топлива");
        System.out.println("Едем ещё 60 км: " + bus.run(50));
        System.out.println("На " + bus.powerReserve() + " км хватит топлива");
    }
}
