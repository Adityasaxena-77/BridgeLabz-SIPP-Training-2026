public class PacketBuffer {
    private final int[] data;
    private int front;
    private int count;

    public PacketBuffer(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        data = new int[capacity];
    }

    public boolean enqueue(int packetId) {
        if (isFull()) {
            return false;
        }
        data[(front + count) % data.length] = packetId;
        count++;
        return true;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Packet buffer is empty");
        }
        int packetId = data[front];
        front = (front + 1) % data.length;
        count--;
        return packetId;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == data.length;
    }

    public int size() {
        return count;
    }

    public static void main(String[] args) {
        PacketBuffer buffer = new PacketBuffer(3);
        buffer.enqueue(101);
        buffer.enqueue(102);
        buffer.enqueue(103);
        System.out.println("Adding packet to full buffer: " + buffer.enqueue(104));
        System.out.println("Processed packet: " + buffer.dequeue());
        buffer.enqueue(104); 

        while (!buffer.isEmpty()) {
            System.out.println("Processed packet: " + buffer.dequeue());
        }
    }
}
