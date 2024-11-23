
import Assignment.Student;
import Helper.readCSV;
import java.util.List;

// import package

public class App {
    public static void main(String[] args) throws Exception {
        String csvFile = "student.csv";
        List<Student> students = readCSV.csvToArray(csvFile);
        for (Student student : students) {
            student.print();
        }
        System.out.println(students.size());

    }
}
