package Problems;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        int num = 100;
        sievePrime(num);
    }

    static void sievePrime(int num) {
        int[] primes = new int[num + 1];

        for (int i = 2; i <= num; i++) {
            if (primes[i] == 0) {
                for (int j = i * i; j <= num; j += i) {
                    primes[j] = 1;
                }
            }
        }

        for (int i = 2; i <= num; i++) {
            if (primes[i] == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
    }

}
