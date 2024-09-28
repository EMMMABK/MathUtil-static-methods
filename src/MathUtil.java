public class MathUtil {
//    I used boolean because in the task  i need to return false and true, so i used boolean, and other
    public static boolean isPrime(int n){
//        I used "if" because I check for numbers less than two, which aren't prime
        if (n <= 1){
            return false;
        }
//    Here I used google to find Math.sqrt(n), because without it i can't check for factors from two
//        to the square root of n, so math.sqrt is using for find square root
        for (int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }
//        so after these operations, if operations didn't find divisors, answer is a prime.
        return true;
    }

    public static int gcd(int a, int b){
//        so this method calculates the gcd, using simple formula
//        this method will work untill b will not equal 0 (if b is 0, gcd is just an a)
        while (b!=0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int lcm(int a, int b){
//        So for solve lcm i just product of a and b divide by gcd, because in the formula of lcm i saw the gcd
        return  (a*b)/gcd(a,b);
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
