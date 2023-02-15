public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        //task5();
        //task6();
        //task7();
        //task8();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

    public static void task1() {
        int[] arr = generateRandomArray();

        System.out.println("Задача 1");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        int sum = 0;
        for (int element : arr) {
            sum += element;
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        }
    }

    public static void task2() {
        int[] arr = generateRandomArray();

        System.out.println("Задача 2");

        int maxArr = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
        }
        //System.out.println("max " +maxArr);

        int minArr = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minArr) {
                minArr = arr[i];
            }
        }
        //System.out.println("min " + minArr);
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей. Максимальная сумма трат за день составила " + maxArr + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();

        System.out.println("Задача 3");

        var sum = 0;
        for (var element : arr) {
            sum += element / 30;
            System.out.println("Средняя сумма трат за месяц составила " + sum + " рублей");
        }
    }
    public static void task4() {
        //int[] arr = generateRandomArray();

        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}