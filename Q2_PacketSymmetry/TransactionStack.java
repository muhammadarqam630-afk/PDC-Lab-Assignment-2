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
}