import java.util.Arrays;

public class Level2 {

    public static void main(String[] args) {
        int[] array = {1, 5, 8, -8, 16, 24, 101, 5, 8};
        int number = 5;
        System.out.println(Arrays.toString(deleteElementFromArray(array, number)));
    }

    public static int[] deleteElementFromArray(int[] array, int number) {

        int step = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                step++;
            } else {
                array[i - step] = array[i];
            }
        }

        return Arrays.copyOf(array, array.length - step);
    }
}

