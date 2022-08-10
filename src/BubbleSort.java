import java.util.Arrays;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void BubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int i = 1; i < list.length && needNextPass; i++) {
            System.out.println("Set needNextPass to false");
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    System.out.printf("Swap list[%d] and list[%d]%n", j, j + 1);
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    System.out.println("Set needNextPass to true");
                    needNextPass = true;
                }
            }
        }
        if (!needNextPass) {
            System.out.println("No need next pass");
        }
    }

    public static void main(String[] args) {
        BubbleSort(list);
        System.out.println(Arrays.toString(list));
    }
}