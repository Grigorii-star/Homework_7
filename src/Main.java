public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int money = 15_000;
        int total = 0;
        int count = 0;
        while (total < 2_459_000) {
            count++;
            total += money;
            System.out.println("Месяц " + count + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int count = 0;
        while (count < 10) {
            count++;
            System.out.print(count + " ");
        }
        System.out.println();
        System.out.print(count + " ");

        for (; count > 1;) {
            count--;
            System.out.print(count + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int totalPeople = 12_000_000;
        int birth = 17;
        int mortality = 8;
        int medBirth = birth - mortality;
        for (int year = 1; year <= 10 ; year++) {
            totalPeople += (totalPeople / 1000) * medBirth;
            System.out.println("Год " + year + ", численность населения составляет " + totalPeople);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int salary = 15_000;
        int total = 0;
        int i = 1;
        for (; total < 12_000_000; i++ ) {
            total += (total / 100) * 0.7;
            total += salary;
            System.out.println(i + " месяц " + total);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int salary = 15_000;
        int total = 0;
        int i = 1;
        for (; total < 12_000_000; i++) {
            total += (total / 100) * 0.7;
            total += salary;
            if (i % 6 == 0) {
                System.out.println(i + " месяц " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int salary = 15_000;
        int total = 0;
        int i = 1;
        for (; i <= 108; i++) {
            total += (total / 100) * 0.7;
            total += salary;
            if (i % 6 == 0) {
                System.out.println(i + " месяц " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int days = 2;
        System.out.println("Сегодня пятница, " + days + " -е число. Необходимо подготовить отчет");
        while (days < 30) {
            days += 7;
                System.out.println("Сегодня пятница, " + days + " -е число. Необходимо подготовить отчет");
        }

    }

    public static void task8() {
        System.out.println("Задача 8");
        for (int year = 0; year < 2123; year += 79) {
            if (year > 1823) {
                System.out.println(year);
            }
        }
    }
}