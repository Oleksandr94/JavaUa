package logicalOperators;

public class LogicalOperator {
    public static void main(String[] args) {
        int gold = 5, silver = 19, bronze = 8;
        System.out.println("Загальна кількість медалей: " + (gold + silver + bronze));

        if (gold > 0 && silver > 0 && bronze > 0) {
            System.out.println("У вас є медалі всіх типів");
        }

        if (gold > 0 || silver > 0 || bronze > 0) {
            System.out.println("У вас є як мінімум 1 медаль");
        }


    }
}
