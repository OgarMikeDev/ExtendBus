public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(0.010);
        bus.refuel(1);
        System.out.println("На " + bus.powerReserve() + " км хватит топлива");

    }
}
