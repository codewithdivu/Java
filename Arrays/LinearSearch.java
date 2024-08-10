package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int key = 25;
        int[] arr = { 23, 453, 232, 54, 12, 77, 34, 25, 43, 7, 31 };

        if (linearSearch(arr, key)) {
            System.out.println("Element found in Array");
        } else {
            System.out.println("Element not found in Array");
        }

    }

    static boolean linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
}
