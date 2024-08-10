package Problems;

public class prime {
    public static void main(String[] args) {
        int num = 33;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Not-Prime");
                return;
            }
        }
        System.out.println("Prime...");
    }
}
