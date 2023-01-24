import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = createRandomArray(30, 100_000, 200_000);

        task1(array);
        task2_1(array);
        task2_2(array);
        task3(array);
        task4();
    }

    private static void task4() {
        System.out.println("Задача 4:");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i=reverseFullName.length-1 ; i >= 0; i--)
        {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

    private static void task3(int[] array) {
        System.out.println("Задача 3:");

        float median = ((float)arraySum(array) / array.length);
        System.out.println("Средняя сумма трат за месяц составила " + median + " рублей");
        System.out.println();
    }

    private static void task2_1(int[] array) {

        System.out.println("Задача 2.1:");

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > maxValue)
                maxValue = j;
            if (j < minValue)
                minValue = j;
        }
        System.out.println("Минимальная сумма трат за день составила " + minValue
                + " рублей. Максимальная сумма трат за день составила " + maxValue + " рублей»");
        System.out.println();
    }

    private static void task2_2(int[] array) {

        System.out.println("Задача 2.2:");

        Arrays.sort(array);
        System.out.println("Минимальная сумма трат за день составила " + array[0]
                + " рублей. Максимальная сумма трат за день составила " + array[array.length - 1] + " рублей»");

        System.out.println();
    }

    private static void task1(int[] array) {
        System.out.println("Задача 1:");
        System.out.println("Сумма трат за месяц составила " + arraySum(array) + " рублей");
        System.out.println();
    }

    private static int arraySum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }


    public static int[] createRandomArray(int n, int min, int max) {
        Random rd = new Random();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(max - min) + min;
        }
        return array;
    }


}