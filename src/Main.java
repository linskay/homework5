public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, наставник!");
        System.out.println("Задание 1+2");

        int clientOS = 0;
        int clientDeviceYear = 2013;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }

        System.out.println("Задание 3");
        int year = 2024;
        int yearStart = 1584;
        int everyFourth = 4;
        int hundred = 100;
        int fourHundred = 400;
        if ((year > yearStart && year % everyFourth == 0 && year % hundred != 0) || (year > yearStart && year % fourHundred == 0)) {
            System.out.println("Этот год високосный");
        } else {
            System.out.println("Год не високосный");
        }

        System.out.println("Задание 4");
        int deliveryDistance = 95;
        boolean distance1 = deliveryDistance < 20;
        boolean distance2 = (deliveryDistance < 60 && deliveryDistance>= 20);
        boolean distance3 = (deliveryDistance <100 && deliveryDistance >= 60);
        if (distance1) System.out.println("Потребуется один день");
        if (distance2) System.out.println("Потребуется два дня");
        if (distance3) System.out.println("Потребуется три дня");
        else System.out.println("Доставки нет");

        System.out.println("Задание 5");

        int monthNumber = 12;
        switch (monthNumber){
            case 1:
        System.out.println("Январь");
        break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
            default:
                System.out.println("Некорректный месяц");
        }
    } }
