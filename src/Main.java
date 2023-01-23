import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int [] array = createRandomArray(30, 100_000, 200_000);
        task1(array);


    }

    private static void task1(int [] array) {
        int sum=0;
        for(int i:array)
        {
            sum+= i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
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