package Problems;

public class gcd_hcf {
    public static void main(String[] args) {
        int a = 22, b = 9;
        System.out.println("Old way -> " + gcd_old(a, b));
        System.out.println("New way -> " + gcd_new(a, b));
    }

    static int gcd_old(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    static int gcd_new(int a, int b) {
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

// BASED ON INCLUSION-EXCLUSION PRINCIPLE