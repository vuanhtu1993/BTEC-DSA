
// import package
import Assignment.Student;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner in = new Scanner(new File("text.txt"));
        // StringBuilder sb = new StringBuilder();
        // while (in.hasNext()) {
        // sb.append(in.next());
        // }
        // in.close();
        // String outString = sb.toString();
        List<Student> classroom = new ArrayList<Student>();
        // Lớp gồm có 10 sinh viên;
        Student Hoang = new Student("Van Hoang", "BH01093", 8.5);
        Student Trang = new Student("Trang", "BH01093", 8.5);
        // Student student1 = new Student("Van Hoang", "BH01093", 8.5);
        // Student student1 = new Student("Van Hoang", "BH01093", 8.5);
        // Student student1 = new Student("Van Hoang", "BH01093", 8.5);
        // Student student1 = new Student("Van Hoang", "BH01093", 8.5);
        classroom.add(Hoang);
        classroom.add(Trang);

        // System.out.println(classroom);
        for (Student student : classroom) {
            student.print();
            System.out.println("--------------------");
        }
        // System.out.println(student1.convertToRank());

    }
}
