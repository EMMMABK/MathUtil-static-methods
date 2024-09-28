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

    public static int fibonacci(int n){
//i created a and b because google said: The first two numbers are given immediately and are equal to 0 and 1.
        int a=0;
        int b=1;
        if (n <= 1){
            return n;
        }
//        n is the position in fibonacci sequence, like n-th number
        for (int i=2;i<=n;i++){
            int t = a+b;
            a=b;
            b=t;
        }
        return b;
    }

    public static int factorial(int n){
        int a = 1;
        if(n == 0 || n == 1){
            return 1;
        }
//        so if n eqauls to 0,1 that's means 1! = 1 like this
        for(int i=2;i<=n;i++){
            a *=i; // a = a * i
        }
//     for loop this is a loop that starts with i equal to 2 and will run until i is greater than n. After each iteration i increases by 1
        return a;
    }

    public boolean isPerfectNumber(int n){
        int sumOf = 1;
        for(int i=2;i<=Math.sqrt(n); i++){
            if(n%1==0){
                sumOf += i+(n/i != i ? n/i:0);
            }
        }
        return sumOf == n && n!=1;
    }

    public int sumOfDigits(int n){
        int sum = 0;
        for(int i=0; i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    public int reverseNumber(int n){
        int total = 0;
        while(n!=0){
            int a = n%10;
            total = total*10+a;
            n/=10;
        }
        return total;
    }

    public void isArmstrongNumber(int n){
    }

    public int nextPrime(int n){
        int a=n+1;
        while(!isPrime(a)){
            a++;
        }
        return a;
    }
}
