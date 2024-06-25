import settingsapxepnoibot.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {1, 5, 7, 3, 6, 9, 8};
        BubbleSort.bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }
}