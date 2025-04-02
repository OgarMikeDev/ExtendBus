public class Bus {
    /*
    Насколько заполнен
    топливный бак
    (от 0 до 95)
     */
    protected double tankFullnessRate;

    /*
    Расход топлива на 1 км
    95 - 100%
    9,5 - 10%
    0,95 - 1%
    Услово, если бак заполнен на 100%(95),
    а расход - 0,300,
    то кол-ва литров в баке
    хватит на 316 км
    0,300 * x = 95
    x = 95 / 0,300
    x = 316
     */
    protected final double consumptionRate;

    //Кол-во автобусов
    private static int count = 0;

    public Bus(double consumptionRate) {
        this.consumptionRate = consumptionRate;
        count++;
    }

    /*
    На сколько км
    хватит оставшегося топлива
     */
    public int drivingDistance() {
        return (int) (tankFullnessRate / consumptionRate);
    }

    /*
    Заправка автобуса
     */
    public final void refuel(double countLiters) {
        /*
        На сколько заполнен топливный бак
        + кол-во довалиемого бензина
         */
        double totalFuel = tankFullnessRate + countLiters;

        /*
        Если попытаться заполнить бак
        больше чем на 100%,
        он заполнится только до 100%
         */
        tankFullnessRate = totalFuel > 95 ? 95 : totalFuel;
    }

    //Проезд автобуса на определённое расстояние в км
    public boolean run(int distance) {
        /*
        Проверка того,
        сможем ли мы
        пройти указанное расстояние в км
         */
        if (drivingDistance() < distance) {
            return false;
        }

        /*
        Вычитаем из топливноо бака
        кол-во литров
        на заданную дистанцию
         */
        tankFullnessRate -= consumptionRate * distance;
        return true;
    }

    public double getTankFullnessRate() {
        return tankFullnessRate;
    }

    public double getConsumptionRate() {
        return consumptionRate;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "tankFullnessRate=" + tankFullnessRate +
                ", consumptionRate=" + consumptionRate +
                '}';
    }
}
