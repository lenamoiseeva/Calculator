/**
 * @author Lena Moiseeva
 * Calculator
 */
import CalculatorFields.*;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        TextOfFields text = new TextOfFields();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select one of options: 1 - Addition(+), 2 - Subtraction(-), 3 - Multiplication(*), 4 - Division(/)");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    text.getText1();
                    addition.setFn(scanner.nextDouble());
                    text.getText2();
                    addition.setSn(scanner.nextDouble());
                    addition.getResultOfAddition();
                    scanner.close();
                    break;
                case 2:
                    text.getText1();
                    subtraction.setFn(scanner.nextDouble());
                    text.getText2();
                    subtraction.setSn(scanner.nextDouble());
                    subtraction.getResultOfSubtraction();
                    scanner.close();
                    break;
                case 3:
                    text.getText1();
                    multiplication.setFn(scanner.nextDouble());
                    text.getText2();
                    multiplication.setSn(scanner.nextDouble());
                    multiplication.getResultOfMultiplication();
                    scanner.close();
                    break;
                case 4:
                    text.getText1();
                    division.setFn(scanner.nextDouble());
                    text.getText2();
                    division.setSn(scanner.nextDouble());
                    division.getResultOfDivision();
                    scanner.close();
                    break;
                default:
                    System.out.println("Out of range");
            }
        }

    }