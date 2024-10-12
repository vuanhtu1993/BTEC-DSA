package DataStructure;

interface IStack {
    public boolean push(int value);

    public int pop();

    public boolean isFull();

    public boolean isEmpty();

    public void print();

}

public class MyStack implements IStack {
    private int size;
    private int top;
    private int[] stackArray;

    public MyStack(int size) {
        this.size = size;
        top = -1;
        stackArray = new int[size];
    }

    @Override
    public boolean push(int value) {
        if (isFull()) {
            return false;
        } else {
            top++;
            stackArray[top] = value;
            return true;
        }
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            int value = stackArray[top];
            top--;
            return value;
        }
    }

    @Override
    public boolean isFull() {
        return top == size - 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
        }
        System.out.println();
    }

}