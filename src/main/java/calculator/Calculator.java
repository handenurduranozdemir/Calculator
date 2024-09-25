package calculator;

import java.util.Scanner;

import calculator.operations.Operation;

public class Calculator {
    public void start() {
        Scanner kb = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            chooseOperation();
            writeBreakLine();

            int operationCode = kb.nextInt();
            if (operationCode == 0) {
                System.out.println("Çıkış yapılıyor.");
                keepRunning = false;
                break;
            } else if (operationCode < 1 || operationCode > 8){
                System.out.println("Geçersiz işlem. Lütfen Tekrar deneyin.");
                continue;
            }

            
            Operation operation = OperationFactory.getOperation(operationCode);
        
        getNumbers(operation.getName());
    
        int x = kb.nextInt();
        int y = kb.nextInt();
        writeBreakLine();

        double result = operation.calculate(x, y);
        printResult(result);
        System.out.println("Başka işlem yapmak ister misiniz? (E/H)");
        char choice = kb.next().toUpperCase().charAt(0);
        keepRunning = choice == 'E';

        }
        kb.close();
    }

    public static void getNumbers(String name){
        System.out.printf("%s işlemi için gereken sayıları giriniz: ", name);
    }

    //Silmeli miyim bak !
    public static void printResult(int result) {
        System.out.printf("İşlem sonucu: %d%n", result);
    }

    public static void printResult(double result) {
        System.out.printf("İşlem sonucu: %f%n", result);
    }

    public static void chooseOperation() {
        System.out.println("Hangi işlemi yapmak istersiniz ?");
        System.out.println("0 - Çıkış");
        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkarma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");
        System.out.println("5 - Mod Alma");
        System.out.println("6 - Mutlak Değer");
        System.out.println("7 - Üs Alma");
        System.out.println("8 - Karekök");
    }
    public static void writeBreakLine() {
        System.out.println("----------------------------------------------");
    }
}
