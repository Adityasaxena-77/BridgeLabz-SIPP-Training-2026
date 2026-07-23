import java.util.PriorityQueue;

public class Problem295FindMedianFromDataStream {
    public static void main(String[] args) {
        MedianFinder finder = new MedianFinder();
        finder.addNum(1);
        finder.addNum(2);
        System.out.println(finder.findMedian());
        finder.addNum(3);
        System.out.println(finder.findMedian());
    }

    static class MedianFinder {
        private final PriorityQueue<Integer> low = new PriorityQueue<>((a, b) -> b - a);
        private final PriorityQueue<Integer> high = new PriorityQueue<>();

        public void addNum(int num) {
            if (low.isEmpty() || num <= low.peek()) {
                low.offer(num);
            } else {
                high.offer(num);
            }

            if (low.size() > high.size() + 1) {
                high.offer(low.poll());
            } else if (high.size() > low.size()) {
                low.offer(high.poll());
            }
        }

        public double findMedian() {
            if (low.size() > high.size()) {
                return low.peek();
            }
            return (low.peek() + high.peek()) / 2.0;
        }
    }
}
