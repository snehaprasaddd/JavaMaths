package array;

public class max_array {
    public static int find_max(int[] arr, int start, int end) {
        if (arr == null) {
            return -1;
        } else {
            int max = arr[start];
            for (int i = start + 1; i < end; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(find_max(arr, 0, arr.length));   
    }
}
