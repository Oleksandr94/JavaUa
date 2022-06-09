package calc;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner fromUser = new Scanner(System.in);
        double number1, number2, result;
        String diya;


        System.out.println("Введіть перше число.. ");
        number1 = Double.parseDouble(fromUser.nextLine());

        System.out.println("Введіть друге число");
        number2 = Double.parseDouble(fromUser.nextLine());

        System.out.println("Введыть дію (+,-,*,/)");
        diya = fromUser.nextLine();

        if (diya.equals("/") && number2 == 0) {
            System.out.println("На нуль ділити не можна");
        }

        if (diya.equals("+") || diya.equals("додати")) {
            result = number1 + number2;
        } else if (diya.equals("-")|| diya.equals("відняти")) {
            result = number1 - number2;
        } else if (diya.equals("*")|| diya.equals("помножити")) {
            result = number1 * number2;
        } else if (diya.equals("/")|| diya.equals("поділити")) {
            result = number1 / number2;
        } else {
            result = 0;
        }
        System.out.println("Результат " + result);
    }
}
