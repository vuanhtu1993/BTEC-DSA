import DataStructure.MyLinkedList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        // String[] arrayCars = {"Vovol", "BMW"};
        // Linked list in java
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Vovol");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.remove();
        System.out.println(cars);

        MyLinkedList numbers = new MyLinkedList(10);
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);

        // System.out.println(numbers);
        numbers.print();

    }
}