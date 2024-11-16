
import java.util.Arrays;

// import package

public class App {
    public static void main(String[] args) throws Exception {
        // String csvFile = "student.csv";
        // List<Student> students = readCSV.csvToArray(csvFile);
        // for (Student student : students) {
        // student.print();
        // }
        // System.out.println(students.size());
        int[] arr = { 64, 4, 3, 2, 10, 12, 1, 5, 6 };
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
