package Q2_PacketSymmetry;

public class TransactionStack {

    private char[] stack;
    private int top;
    private int capacity;

    public TransactionStack(int capacity) {
        this.capacity = capacity;
        this.stack = new char[capacity];
        this.top = -1;
    }

    public void push(char c) {

    if (top == capacity - 1) {
        throw new IllegalStateException("Stack Overflow!");
    }

    stack[++top] = c;
}

public char pop() {

    if (top == -1) {
        throw new IllegalStateException("Stack Underflow!");
    }

    return stack[top--];
}
public char peek() {

    if (top == -1) {
        throw new IllegalStateException("Stack is Empty!");
    }

    return stack[top];
}

public boolean isEmpty() {
    return top == -1;
}


}