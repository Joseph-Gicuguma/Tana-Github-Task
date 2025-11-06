package calculator;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        final String inputExp = ReadInput.read();
        
        // Split numbers and operations
        String[] numbersArr = inputExp.split("[-+*/]");
        String[] operArr = inputExp.split("[0-9]+");
        
        Queue<String> numbers = new LinkedList<>(Arrays.asList(numbersArr));
        Queue<String> operations = new LinkedList<>(Arrays.asList(operArr));
        operations.removeIf(String::isEmpty);

        Double result = Double.parseDouble(numbers.poll());

        while (!numbers.isEmpty() && !operations.isEmpty()) {
            String opr = operations.poll();
            Operate operate;
            
            switch (opr) {
                case "+": operate = new Add(); break;
                case "-": operate = new Subtract(); break;
                case "*": operate = new Multiply(); break;
                case "/": operate = new Divide(); break;
                default:
                    System.out.println("Invalid operator: " + opr);
                    continue;
            }
            
            Double nextNum = Double.parseDouble(numbers.poll());
            result = operate.getResult(result, nextNum);
        }

        System.out.println("Result: " + result);
    }
}