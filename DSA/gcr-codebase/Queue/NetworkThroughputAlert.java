import java.util.ArrayDeque;
import java.util.Deque;

public class NetworkThroughputAlert {
    public static int[] maxThroughputWindow(int[] readings, int k) {
        if (readings == null) {
            throw new IllegalArgumentException("Readings are required");
        }
        if (k <= 0 || k > readings.length) {
            throw new IllegalArgumentException("Window size must be between 1 and the number of readings");
        }

        int[] maximums = new int[readings.length - k + 1];
        Deque<Integer> candidates = new ArrayDeque<>();

        for (int index = 0; index < readings.length; index++) {
            while (!candidates.isEmpty() && candidates.peekFirst() <= index - k) {
                candidates.removeFirst();
            }
            while (!candidates.isEmpty() && readings[candidates.peekLast()] <= readings[index]) {
                candidates.removeLast();
            }

            candidates.addLast(index);
            if (index >= k - 1) {
                maximums[index - k + 1] = readings[candidates.peekFirst()];
            }
        }
        return maximums;
    }

    public static void main(String[] args) {
        int[] readings = {120, 180, 150, 210, 160, 240, 190};
        int[] maximums = maxThroughputWindow(readings, 3);

        System.out.print("3-second maximums: ");
        for (int maximum : maximums) {
            System.out.print(maximum + " ");
        }
        System.out.println();
    }
}
