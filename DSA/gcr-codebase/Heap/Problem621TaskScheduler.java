import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Problem621TaskScheduler {
    public static void main(String[] args) {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        System.out.println(leastInterval(tasks, n));
    }

    public static int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (char task : tasks) {
            frequency.put(task, frequency.getOrDefault(task, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int count : frequency.values()) {
            maxHeap.offer(count);
        }

        int time = 0;
        while (!maxHeap.isEmpty()) {
            int cycle = 0;
            java.util.List<Integer> temp = new java.util.ArrayList<>();
            for (int i = 0; i < n + 1; i++) {
                if (!maxHeap.isEmpty()) {
                    temp.add(maxHeap.poll() - 1);
                    cycle++;
                }
            }
            for (int value : temp) {
                if (value > 0) {
                    maxHeap.offer(value);
                }
            }
            time += maxHeap.isEmpty() ? cycle : n + 1;
        }
        return time;
    }
}
