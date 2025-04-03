public class ElectricBus extends Bus {
    //Скорость потребления электричества
    private static final double degradationRate = 0.010;

    //Шаг для увеличения потребления энергии
    private static final double minRateToDegrade = 0.1;


    /*
    Минимальное кол-во единиц электричества
    для движения электробуса -
    10% от максимального
     */
    private final double minimalTankFullnessRate;

    //Кол-во электробусов
    private static int count = 0;

    public ElectricBus(double consumptionRate, double minimalTankFullnessRate) {
        super(consumptionRate);
        this.minimalTankFullnessRate = minimalTankFullnessRate;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public int drivingDistance() {
        /*
        95 - максимальный заряд
        10% - 9.5 - минимальный порог
        Расстояние рассчитывается исходя из
        90%, т.е. 85.5
         */
        double remainderBatteryFullness = tankFullnessRate - minimalTankFullnessRate;
        /*
        Если заряда меньше,
        либо равно минимальному,
        то мы можем проехать 0 км
         */
        if (remainderBatteryFullness <= 0) {
            return 0;
        }

        /*
        Считаем расстояние,
        исходя из того кол-ва заряда,
        кот-е мы можем расходовать
         */
        return (int) (remainderBatteryFullness / consumptionRate);
    }

    public double getMinimalTankFullnessRate() {
        return minimalTankFullnessRate;
    }

    @Override
    public void refuel(double countCharge) {
        int countSteps = (int) ((95 - tankFullnessRate) / minRateToDegrade);
        consumptionRate = countSteps * degradationRate;
        super.refuel(countCharge);
    }
}
