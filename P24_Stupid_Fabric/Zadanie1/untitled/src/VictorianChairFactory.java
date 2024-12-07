public class VictorianChairFactory extends ChairFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}