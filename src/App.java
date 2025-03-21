import Algorithm.QuickSort;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // int n = 100000;
        // int[] testArray = new int[n];
        // for (int i = 0; i < testArray.length; i++) {
        // testArray[i] = (int) (Math.random() * 100000000);
        // }
        // long startTime = System.currentTimeMillis();
        // // int[] testArray = { 20, 50, 40, 80, 60, 70, 10, 90 };

        // MergeSort.mergeSort(testArray);
        // // bubbleSort.bubbleSort(testArray);
        // long estimatedTime = System.currentTimeMillis() - startTime;
        // System.out.println(Arrays.toString(testArray));
        // System.out.println(estimatedTime);
        int[] testArr = { 10, 80, 30, 90, 60 };
        QuickSort.quickSort(testArr, 0, testArr.length - 1);
        System.out.println(Arrays.toString(testArr));
    }
}
