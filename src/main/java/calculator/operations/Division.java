package calculator.operations;

public class Division implements Operation{

    @Override
    public double calculate(int x, int y) {
        if ( y == 0) {
            throw new IllegalArgumentException("Bölme işleminde bölen sıfır olamaz.");
        }
        return (double) x / y;
    }

    @Override
    public String getName() {
        return "Bölme";
    }
    
}
