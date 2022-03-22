//This program finds out largest prime number upto a given range 
public class LargestPrime {
    public static int getLargestPrime(int number) {
        int i;
        if (number <= 0)
            return -1;
        else {
            for (i = 2; i <= number; i++) {
                if (number % i == 0) {
                    number /= i;
                    i--;
                }
            }
            return i;
        }
    }

    public static void main(String[] args) {
        System.out.println(LargestPrime.getLargestPrime(21));
        System.out.println(LargestPrime.getLargestPrime(217));
        System.out.println(LargestPrime.getLargestPrime(0));
        System.out.println(LargestPrime.getLargestPrime(45));
        System.out.println(LargestPrime.getLargestPrime(-1));
    }
}
