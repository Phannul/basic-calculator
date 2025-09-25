import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        String input = scanner.nextLine();

        double firstNumber = Double.parseDouble(input);

        System.out.println("Enter the Second Number: ");
        String secondInput = scanner.nextLine();

        double secondNumber = Double.parseDouble(secondInput);

        System.out.println("Possible Operations are" +
                "(A)ddition\n" +
                "(S)ubtraction\n" +
                "(M)ultiplication\n" +
                "(D)ivision\n");
        String operationChoice = scanner.nextLine();

        double product = firstNumber * secondNumber;

        System.out.println("The Product is " + product);

        //System.out.println("The Result is: " + (input * secondInput));






    }
}
