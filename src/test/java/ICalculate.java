public interface ICalculate {
    default double calculate(double value) {
        return value;
    }

}
