package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 12, 16, 19, 23, 37, 49, 61, 79, 88 };
        int key = 992;
        int answer = search(arr, key);
        if (answer == -1) {
            System.out.println("item is not found in arr");
            return;
        }
        System.out.println("item is found at " + answer + " index");
    }

    static int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
