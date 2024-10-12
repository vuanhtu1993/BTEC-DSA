
// import package
import DataStructure.MyStack;

public class App {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(10);
        stack.push(10);
        stack.push(5);
        stack.push(8);
        stack.push(20);
        stack.push(40);
        stack.print();
    }
}
