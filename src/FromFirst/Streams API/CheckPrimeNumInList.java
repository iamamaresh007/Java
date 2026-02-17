import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
        boolean result = primes.stream().anyMatch(Main::isPrime);
        System.out.println("List contains a prime number: " + result);
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
