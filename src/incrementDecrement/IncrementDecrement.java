package incrementDecrement;

import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String[] args) {
        Scanner introduction = new Scanner(System.in);
        System.out.println("Введіть кількість морозива ");
        int HowMuchIceCream;
        HowMuchIceCream = introduction.nextInt();
        HowMuchIceCream +=5;
        System.out.print("Нова кількість " + HowMuchIceCream);

    }
}
