package settingsapxepnoibot;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        boolean changed = true;
        for (int i = 0; i < arr.length - 1 && changed; i++) {
            changed = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    changed = true;
                }
            }
        }
    }
}
