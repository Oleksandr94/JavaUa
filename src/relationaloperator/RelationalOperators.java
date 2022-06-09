package relationaloperator;

public class RelationalOperators {
    public static void main(String[] args) {

        // more більше
        int number = 7;

        if (number > 5) {
            System.out.println(">: Number  more than 5");
        } else {
            System.out.println(">: Number NOT more than 5");
        }

        // less менше
        if (number < 11) {
            System.out.println("<: Number less than 11");
        } else {
            System.out.println("<: Number NOT less than 11");
        }

        // equal дорівнює
        if (number == 9) {
            System.out.println("==: Number equal than 9");
        } else {
            System.out.println("==: Number NOT equal 9");
        }

        // not equal не дорівнює
        if (number != 11) {
            System.out.println("!=: Number equal than 11");
        } else {
            System.out.println("!=: Number NOT equal 11");
        }

        // more or equal більше або =
        if (number >= 8) {
            System.out.println(">=: Number more or equal 8");
        } else {
            System.out.println(">=: Number NOT more or equal 8");
        }

        // less or equal менше або =
        if (number <= 4) {
            System.out.println("<=: Number less or equal 4");
        } else {
            System.out.println("<=: Number NOT less or equal 4");
        }

    }

}
