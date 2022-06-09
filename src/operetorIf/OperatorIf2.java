package operetorIf;

public class OperatorIf2 {
    public static void main(String[] args) {
        int price_audi = 12000;
        int price_bmw = 15000;
        int price_lexus = 20000;


        int my_salary = 1;

        if (my_salary >= price_audi) {
            System.out.println("You have buy AUDI");
        } else if (my_salary >= price_bmw) {
            System.out.println("You have buy BMW");
        } else if (my_salary >= price_lexus) {
            System.out.println("You have buy LEXUS");
        } else  {
            System.out.println("You will ride the bus");
        }
    }
}
