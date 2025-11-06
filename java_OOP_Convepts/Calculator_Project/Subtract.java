package calculator;

public class Subtract implements Operate {
    @Override
    public Double getResult(Double... numbers) {
        if (numbers.length == 0) return 0.0;
        Double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }
}