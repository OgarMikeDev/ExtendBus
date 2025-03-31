public class ElectricBus extends Bus {
    //Минимальная степень наполнения резервуара
    private final double minimalTankFullnessRate;
    public ElectricBus(double consumptionRate, double minimalTankFullnessRate) {
        super(consumptionRate);
        this.minimalTankFullnessRate = minimalTankFullnessRate;
    }
}
