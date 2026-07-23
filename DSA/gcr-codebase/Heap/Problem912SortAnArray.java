import java.util.PriorityQueue;

public class Problem912SortAnArray {
    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        int[] result = sortArray(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortArray(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = minHeap.poll();
        }
        return nums;
    }
}
