package calculator.operations;

public class Power implements Operation{

    @Override
    public double calculate(int base, int component) {
        return Math.pow(base, component);
    }

    @Override
    public String getName() {
        return "Üs alma";
    }
    
}
