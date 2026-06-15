public class FootballTeamStats {
    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static double meanHeight(int[] heights) {
        return sumOfArray(heights) / (double) heights.length;
    }

    public static int shortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) shortest = height;
        }
        return shortest;
    }

    public static int tallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) tallest = height;
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int) (Math.random() * 101);
        }

        System.out.println("Sum of heights: " + sumOfArray(heights));
        System.out.println("Mean height: " + meanHeight(heights));
        System.out.println("Shortest height: " + shortestHeight(heights));
        System.out.println("Tallest height: " + tallestHeight(heights));
    }
}
