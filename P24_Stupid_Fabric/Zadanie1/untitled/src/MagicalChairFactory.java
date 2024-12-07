public class MagicalChairFactory extends ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicalChair();
    }
}
