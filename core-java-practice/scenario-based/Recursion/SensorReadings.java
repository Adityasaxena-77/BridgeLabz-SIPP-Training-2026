public class SensorReadings {

    public static boolean Increasing(int[] arr, int n) {
        if (n == arr.length - 1) {
            return true;
        }

        if (arr[n] >= arr[n + 1]) {
            return false;
        }

        return Increasing(arr, n + 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 11, 12,13, 14};
        SensorReadings r = new SensorReadings();
        boolean ans = r.Increasing(arr, 0);
        System.out.println(ans);
    }
}