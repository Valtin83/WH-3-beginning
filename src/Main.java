public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("Задача №2");
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения" +
                    " для Android по ссылке");
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println(" Задача №3");
        int year = 2020;
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        System.out.println("Задача №4");
        int deliveryDistance = 95;
        int dey = 1;
        boolean deliveryOneDay = (deliveryDistance < 20);
        if (deliveryOneDay) {
            System.out.println("Потребуется дней: " + dey);
        }
        boolean deliveryTwoDay = (deliveryDistance > 20) && (deliveryDistance < 60);
        if (deliveryTwoDay) {
            System.out.println("Потребуется дней: " + (dey + 1));
        }
        boolean deliveryThreeDay = (deliveryDistance > 60) && (deliveryDistance < 100);
        if (deliveryThreeDay) {
            System.out.println("Потребуется дней: " + (dey + 2));
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        }

        System.out.println("Задача №5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимнй месяц.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний меяц.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц.");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }


    }
}