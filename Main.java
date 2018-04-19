import java.util.Scanner;

/**
 * Created by hp on 4/19/2018.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first no");
        double valueOne = scanner.nextDouble();
        System.out.println("Please enter second no");
        double valueTwo = scanner.nextDouble();
        System.out.println("Please enter operator");
        String operator = scanner.next();
        showOutput(valueOne, valueTwo, operator);

        System.out.println("DO you wish to contniue press (y or n)");
        String option = scanner.next();
        showOutput1(option);
    }


    private static void showOutput1(String option) {
        if (option.equals("y")){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter first no");
            double valueOne = scanner.nextDouble();
            System.out.println("Please enter second no");
            double valueTwo = scanner.nextDouble();
            System.out.println("Please enter operator");
            String operator = scanner.next();
            showOutput(valueOne, valueTwo, operator);

        }
        else if(option.equals("n")){
            System.out.print("Thanks For Using Our Calculator");

        }
    }



    private static void showOutput(double valueOne, double valueTwo, String operator) {
        Calculator calculator = new Calculator();
        if (operator.equals("+")) {
            System.out.print(calculator.add(valueOne, valueTwo));
        } else if (operator.equals("-")) {
            System.out.print(calculator.subtract(valueOne, valueTwo));
        } else if (operator.equals("*")){
            System.out.print(calculator.multiply(valueOne, valueTwo));
        }else if (operator.equals("/")){
            System.out.print(calculator.divide(valueOne,valueTwo));
        }
    }

}
