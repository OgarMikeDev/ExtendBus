public class ElectricBus extends Bus {
    //Минимальная степень наполнения резервуара
    private final double minimalTankFullnessRate;
    public ElectricBus(double consumptionRate, double minimalTankFullnessRate) {
        super(consumptionRate);
        this.minimalTankFullnessRate = minimalTankFullnessRate;
    }

    @Override
    public boolean run(int distance) {
        if (powerReserve() < distance) {
            return false;
        }
        if (tankFullnessRate < minimalTankFullnessRate) {
            return false;
        }
        tankFullnessRate -= consumptionRate * distance;
        return true;
    }
}
