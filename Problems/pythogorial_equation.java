package Problems;

public class pythogorial_equation {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 6;
        if (isPythagorial(a, b, c)) {
            System.out.println("Pythagoral Tripet");
        } else {
            System.out.println("Not-Pythagoral");
        }
    }

    static boolean isPythagorial(int a, int b, int c) {
        int x = Math.max(a, Math.max(b, c));
        int y, z;

        if (x == a) {
            y = b;
            z = c;
        } else if (x == b) {
            y = a;
            z = c;
        } else {
            y = a;
            z = b;
        }

        if (x * x == (y * y + z * z)) {
            return true;
        }
        return false;
    }
}
