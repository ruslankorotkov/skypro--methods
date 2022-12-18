class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void printLeapYearSearch(int xYear) {
        if ((xYear % 4 == 0) && (xYear % 100 != 0) || (xYear % 400 == 0)) {
            System.out.println(xYear + " год — високосный год.");
        } else {
            System.out.println(xYear + " год — невисокосный год.");
        }
    }

    public static void printDevice(int clientOS, int clientDeviceYear) {
        int year = 2022;
        if (clientDeviceYear > year) {
            if (clientOS < 1) {
                System.out.println(" Установите версию приложения для iOS по ссылке ");
            } else {
                System.out.println(" Установите версию приложения для Android по ссылке ");
            }
        }
        if (clientDeviceYear <= year) {

            if (clientOS < 1) {
                System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
            } else {
                System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
            }
        }
    }

    public static int timeExpenditureDelivery(int delivery) {
        int day = 0;
        if (delivery >= 1 && delivery <= 20) {
            day = 1;
        } else if (delivery > 20 && delivery <= 60) {
            day = 2;
        } else if (delivery > 60 && delivery <= 100) {
            day = 3;
        }
        return day;
    }

    public static void task1() {
        System.out.println(" Задача 1 ");
        int year = 2021;
        printLeapYearSearch(year);
    }

    public static void task2() {
        System.out.println(" Задача 2 ");
        int clientOS = 0;
        int clientDeviceYear = 2023;
        printDevice(clientOS, clientDeviceYear);
    }

    public static void task3() {
        System.out.println(" Задача 3 ");
        int deliveryDistance = 95;
        timeExpenditureDelivery(deliveryDistance);
        if (deliveryDistance > 100) {
            System.out.println(" Свыше 100 км доставки нет. ");
        } else {
            System.out.println(" Потребуется дней: " + timeExpenditureDelivery(deliveryDistance));
        }
    }
}