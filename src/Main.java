public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача №1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age +
                    " , то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age +
                    " , то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача №2");
        int temp = 6;
        if (temp <= 5) {
            System.out.println("На улице " + temp +
                    " градусов, нужно надеть шапку.");

        } else {
            System.out.println("«На улице " + temp +
                    " градусов, можно идти без шапки.");
        }

        System.out.println("Задача №3");
        int speed = 57;
        if (speed > 60) {
            System.out.println("Если скорость " + speed +
                    " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed +
                    " км/ч, то можно ездить спокойно.");
        }

        System.out.println(" Задаа №4");
        int ageOfStay = 15;
        if (ageOfStay >= 2 && ageOfStay <= 6) {
            System.out.println("Если возраст человека равен " + ageOfStay +
                    " , то ему нужно ходить в детский сад.");
        }
        if (ageOfStay >= 7 && ageOfStay <= 17) {
            System.out.println("Если возраст человека равен " + ageOfStay +
                    ", то ему нужно ходить в школу.");
        }
        if (ageOfStay >= 18 && ageOfStay <= 24) {
            System.out.println("Если возраст человека равен " + ageOfStay +
                    ",его место в университете.");
        }
        if (ageOfStay > 24) {
            System.out.println("Время ходить на работу.");
        }

        System.out.println("Задача №5");
        int ageChild = 10;
        int escort = 1;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild +
                    ", то ему не рвзрешено кататься на аттракционе.");
        }
        if (ageChild >= 5 && ageChild <= 14 && escort >= 1) {
            System.out.println("Если возраст ребенка равен " + ageChild +
                    ", то можно кататься на аттракционе в сопровождении.");
        } else {
            System.out.println("Без сопровождения катататься нельзя.");
        }
        if (ageChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild +
                    ", то можо кататься без сопровождения взрослого");
        }

        System.out.println("Задача №6");
        int passengers = 105;
        int carCapacity = 102;
        int seating = 60;
        if (passengers <= 60) {
            System.out.println("В вагоне есть " + (seating - passengers) +
                    " сидячих мест и " + (carCapacity - seating) + " стоячих.");
        } else {
            System.out.println("Сидячих мест 0. Стоячих мест  " +
                    (carCapacity - passengers));
        }
        if (passengers > 102) {
            System.out.println("Вагон переполнен на " +
                    -(carCapacity - passengers) + " человека.");
        }
    }
}