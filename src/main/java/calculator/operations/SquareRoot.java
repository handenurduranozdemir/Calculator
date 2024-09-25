package calculator.operations;

public class SquareRoot implements Operation{

    @Override
    public double calculate(int x, int y) {
        return Math.sqrt(x);
    }

    @Override
    public String getName() {
        return "Karekök";
    }
    
}
