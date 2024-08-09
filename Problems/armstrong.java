package Problems;

public class armstrong {
    public static void main(String[] args) {
        int num = 307;
        if (isArmStrong(num)) {
            System.out.println("Number is ArmStrong");
        } else {
            System.out.println("Number is not ArmStrong");
        }
    }

    static boolean isArmStrong(int num) {
        int sum = 0;
        int originalNum = num;
        int noOfdigits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, noOfdigits);
            num /= 10;
        }

        return originalNum == sum;
    }
}

/*
 * 153
 * 370
 * 371
 * 407
 */