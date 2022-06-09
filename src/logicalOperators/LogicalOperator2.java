package logicalOperators;

import java.util.Scanner;

public class LogicalOperator2 {
    public static void main(String[] args) {
        System.out.println("Введіть свій вік");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        if (age>120){
            System.out.println("Щось Вам багато років");
        }

    }
}
