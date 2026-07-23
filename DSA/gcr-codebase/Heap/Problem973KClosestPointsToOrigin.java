import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Problem973KClosestPointsToOrigin {
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        List<List<Integer>> result = kClosest(points, 2);
        System.out.println(result);
    }

    public static List<List<Integer>> kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> distance(b) - distance(a));

        for (int[] point : points) {
            if (maxHeap.size() < k) {
                maxHeap.offer(point);
            } else if (distance(point) < distance(maxHeap.peek())) {
                maxHeap.poll();
                maxHeap.offer(point);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        while (!maxHeap.isEmpty()) {
            int[] point = maxHeap.poll();
            List<Integer> pair = new ArrayList<>();
            pair.add(point[0]);
            pair.add(point[1]);
            result.add(pair);
        }
        return result;
    }

    private static int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
