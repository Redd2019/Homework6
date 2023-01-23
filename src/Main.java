public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1");
        for(int n = 1; n <= 10; n = n + 1){
            System.out.println("Итерация цикла " + n);
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        for (int a = 10; a >= 1; a = a - 1) {
            System.out.println("Итерация цикла " + a);
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        for (int a = 0; a <= 17; a = a+2) {
            System.out.println(a);
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        for (int a = 10; a >= -10 && a <= 10; a = a - 1) {
            System.out.println(a);
        }
    }
}