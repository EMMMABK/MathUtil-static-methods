public class MathUtil {
    public static void isPrime(int n){
//        I used "if" because I check for numbers less than two, which aren't prime
        if (n <= 1){
            System.out.println("not prime");
            return;
        }
//    Here I used google to find Math.sqrt(n), because without it i can't check for factors from two
//        to the square root of n, so math.sqrt is using for find square root
        for (int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                System.out.println("not prime");
                return;
            }
        }
//        so after these operations, if operations didn't find divisors, answer is a prime.
        System.out.println("prime");
    }

    public static void gcd(int a, int b){

    }

    public static void lcm(int a, int b){

    }

    public static void fibonacci(int n){

    }

    public static void factorial(int n){

    }

    public void isPerfectNumber(int n){

    }

    public void sumOfDigits(int n){

    }

    public void reverseNumber(int n){

    }

    public void isArmstrongNumber(int n){

    }

    public void nextPrime(int n){

    }
}
