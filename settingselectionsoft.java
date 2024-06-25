import java.util.Arrays;

import static java.util.Collections.list;

public class settingselectionsoft {
    public static void main(String[] args) {
        int[] list = {1, 4, 6, 2, 3, 9, 7};
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void selectionSort(int[] list){
        for (int i = 0; i<list.length; i++){
            int min = i;
            for (int j = i+1; j<list.length; j++){
                if (list[j] < list[min]){
                    min = j;
                }
            }
            if (min != list[i]){
                int temp = list[i];
                list[i] = list[min];
                list[min] = temp;

            }
        }
    }
}
