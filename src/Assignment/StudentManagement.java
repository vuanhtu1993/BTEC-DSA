package Assignment;

import java.util.List;
import Helper.*;

public class StudentManagement {
    List<Student> database;

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        sm.database.get(100).getStudent();
    }

    public StudentManagement() {
        // Initialize database
        System.out.println("Reading data from CSV file..." + System.getProperty("user.dir"));
        database = readCSV.csvToArray(System.getProperty("user.dir") + "/student.csv");
        System.out.println(database.size());
    }

    public void add(String id, String name, double mark) {

    }

    public void update(String id, String name, double mark) {

    }

    public int delete(String id) {
        return 0;
    }

}
