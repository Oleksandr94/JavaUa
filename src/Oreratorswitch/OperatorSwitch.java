package Oreratorswitch;

import java.util.Scanner;

public class OperatorSwitch {
    public static void main(String[] args) {
        System.out.println("Введіть першу літеру своєї області");
        String litera = "";
        Scanner scanner = new Scanner(System.in);
        litera = scanner.nextLine();
        switch (litera.toLowerCase()) {
            case "в":
                System.out.println("Вінницька або Волинська");
                break;
            case "д":
                System.out.println("Дніпропетровська або Донецька");
                break;
            case "ж":
                System.out.println("Житомирська");
                break;
            case "з":
                System.out.println("Запоріжська або Закарпатська");
                break;
            case "і":
                System.out.println("Івано-Фрвнківська");
                break;
            case "к":
                System.out.println("Київська або Кіровоградська або АР Крим");
                break;
            case "л":
                System.out.println("Луганська або Львівська");
                break;
            case "м":
                System.out.println("Миколаївська");
                break;
            case "о":
                System.out.println("Одеська");
                break;
            case "п":
                System.out.println("Полтавська");
                break;
            case "р":
                System.out.println("Рівненська");
                break;
            case "с":
                System.out.println("Сумська");
                break;
            case "т":
                System.out.println("Тернопільська");
                break;
            case "х":
                System.out.println("Харківська або Херсонська або Хмельницька");
                break;
            case "ч":
                System.out.println("Черкаська або Чернівецька або Чернігівська");
                break;
            default:
                System.out.println("Області на таку літеру не знайдено");
                break;

        }


    }
}
