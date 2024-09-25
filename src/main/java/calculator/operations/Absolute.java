package calculator.operations;

public class Absolute implements Operation{

    @Override
    public double calculate(int x, int y) {
        return Math.abs(x);
    }

    @Override
    public String getName() {
        return "Mutlak değer";
    }
    
}
