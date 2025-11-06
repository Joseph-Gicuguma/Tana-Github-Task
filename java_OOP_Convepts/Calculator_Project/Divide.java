package calculator;

public class Divide implements Operate {
    @Override
    public Double getResult(Double... numbers) {
        if (numbers.length == 0) return 0.0;
        Double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                System.out.println("Error: Division by zero is not allowed!");
                return null;
            }
            result /= numbers[i];
        }
        return result;
    }
}