public abstract class USD extends Coin{
   private final double UsdValue = 3.52;
    @Override
    public double getValue() {
        return UsdValue;
    }
    @Override
    public double calculate(double usdInput){
    return usdInput*getValue();
    }
}
