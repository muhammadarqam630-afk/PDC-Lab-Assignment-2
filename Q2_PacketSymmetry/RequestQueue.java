package Q2_PacketSymmetry;

public class RequestQueue {

    private char[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public RequestQueue(int capacity) {

        this.capacity = capacity;
        this.queue = new char[capacity];

        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }
}