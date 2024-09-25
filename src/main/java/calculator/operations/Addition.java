package calculator.operations;

public class Addition implements Operation{

    @Override
    public double calculate(int x, int y) {
        return x + y;
    }

    @Override
    public String getName() {

        return "Toplama";
    }
    
}
