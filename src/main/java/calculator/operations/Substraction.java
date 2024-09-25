package calculator.operations;

public class Substraction implements Operation{

    @Override
    public double calculate(int x, int y) {
        return x - y;
    }

    @Override
    public String getName() {
        return "Çıkarma";
    }
    
}
