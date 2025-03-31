public class Bus {
    /*
    Насколько заполнен бак
    топливный бак
    (от 0 до 1)
     */
    private double tankFullnessRate;

    /*
    Расход топлива
    на 1 км.
    100% - 1
    10% - 0.100
    1% - 0.010
    Условно, если бак заполнен на 100% (единица), а расход —
    0,01, бака хватит на 100 км
    0,010 * x = 1
    x = 1 / 0.01
    x = 100
     */
    private final double consumptionRate;

    //Кол-во автобусов
    private static int countBuses = 0;

    public Bus(double consumptionRate) {
        this.consumptionRate = consumptionRate;
        countBuses++;
    }

    //Проезд автобуса на определённое расстояние в км
    public boolean run(int distance) {
        //Проверка наличия бензина для отправки
//        if (consumptionRate * distance > tankFullnessRate) {
//            return false;
//        }
        /*
        Проверка того,
        сможем ли мы
        пройти указанное расстояние в км
         */
        if (powerReserve() < distance) {
            return false;
        }
        /*
        Вычитаем из топливного бака
        кол-во литров на
        заданную дистанцию
         */
        tankFullnessRate -= consumptionRate * distance;
        return true;
    }
    /*
    На сколько км
    хватит оставшегося топлива
     */
    public int powerReserve() {
        return (int) (tankFullnessRate / consumptionRate);
    }
    //Заправка автобуса
    public void refuel(double tankRate) {
        /*
        На сколько заполнен топливный бак
        + кол-во доливаемого бензина
         */
        double totalTankRate = tankFullnessRate + tankRate;
        /*
        Если попытаться заполнить бак
        больше чем на 100%,
        он заполнится только до 100%
         */
        tankFullnessRate = totalTankRate > 1 ? 1 : totalTankRate;
    }
    public double getTankFullnessRate() {
        return tankFullnessRate;
    }

    public double getConsumptionRate() {
        return consumptionRate;
    }

    public static int getCountBuses() {
        return countBuses;
    }

    public static void setCountBuses(int countBuses) {
        Bus.countBuses = countBuses;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "tankFullnessRate=" + tankFullnessRate +
                ", consumptionRate=" + consumptionRate +
                '}';
    }
}
