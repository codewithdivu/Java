package Problems;

public class checkPalindrome {
    public static void main(String[] args) {
        String str = "nittgin";
        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not-Palindrome");
        }
    }

    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
