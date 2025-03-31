public class ElectricBus extends Bus {
    /*
    Минимальное кол-во единиц электричества
    для движения электробуса -
    10% от максимального
     */
    private final double minimalTankFullnessRate;

    public ElectricBus(double consumptionRate, double minimalTankFullnessRate) {
        super(consumptionRate);
        this.minimalTankFullnessRate = minimalTankFullnessRate;
    }

    @Override
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
        Проверка того,
        что в электробусе есть
        10% заряда
         */
        if (tankFullnessRate < minimalTankFullnessRate) {
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
}
