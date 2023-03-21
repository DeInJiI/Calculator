import java.util.Scanner;

public class Main {


    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Write the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Write the second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter an action: ");
        char action = scanner.next().charAt(0);

        int result;


        switch (action){
            case '+':
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (number2 == 0)
                    System.out.println("Error");
                else {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                }
                break;
            case '%':
                result = number1 % number2;
                System.out.println("Result: " + result);
                break;
        }
    }
}