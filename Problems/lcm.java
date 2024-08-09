package Problems;

public class lcm {
    public static void main(String[] args) {
        int a = 22, b = 9;

        int gcd = GCD(a, b);
        int lcm = (a * b) / gcd;
        System.out.println("LCM -> " + lcm);
    }

    static int GCD(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        while (a != 0 && b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a == 0 ? b : a;
    }
}

// LCM(A, B) = (A * B) / GCD(A, B)