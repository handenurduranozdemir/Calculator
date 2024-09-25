package calculator;

import calculator.operations.Absolute;
import calculator.operations.Addition;
import calculator.operations.Division;
import calculator.operations.Modulus;
import calculator.operations.Multiplication;
import calculator.operations.Operation;
import calculator.operations.Power;
import calculator.operations.SquareRoot;
import calculator.operations.Substraction;

public class OperationFactory {
    public static Operation getOperation(int operation) {
        switch(operation) {
            case 1:
                return new Addition();
            case 2:
                return new Substraction();
            case 3:
                return new Multiplication();
            case 4:
                return new Division();
            case 5:
                return new Modulus();
            case 6:
                return new Absolute();
            case 7:
                return new Power();
            case 8:
                return new SquareRoot();
            default:
                throw new IllegalArgumentException("Geçersiz işlem seçimi!");
        }
    }
    
}
