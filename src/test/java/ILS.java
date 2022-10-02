public abstract class ILS extends Coin{
    private final double IlsValue = 0.28;
    @Override
    public double getValue() {
        return IlsValue ;
    }
    @Override
    public double calculate(double ilsInput) {
        return ilsInput*getValue();
    }
}
