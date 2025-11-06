package calculator;

public class Multiply implements Operate {
    @Override
    public Double getResult(Double... numbers) {
        if (numbers.length == 0) return 0.0;
        Double result = 1.0;
        for (Double num : numbers) {
            result *= num;
        }
        return result;
    }
}