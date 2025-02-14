import DataStructure.MyQueue;

public class App {
    public static void main(String[] args) throws Exception {
        // ======== Stack ===========
        // MyStack stack = new MyStack();
        // stack.push(10);
        // stack.pop();
        // stack.pop();
        // System.out.println(stack.toString());

        // =========== QUEUE ===========
        MyQueue queue = new MyQueue();
        queue.add(10);
        queue.add(20);
        queue.add(50);
        queue.add(60);
        queue.add(80);
        queue.print();
    }
}