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
        int sumOf = 1; // Start with 1, since 1 is a proper divisor of all integers
        for(int i=2;i<=Math.sqrt(n); i++){ // iterate from 2 to the square root of n
            if(n%1==0){ // it checks if i is a divisor of n
                sumOf += i+(n/i != i ? n/i:0);
            }
        }
        return sumOf == n && n!=1; //just cheking
    }

    public int sumOfDigits(int n){
        int sum = 0;
        // this method just count from 0 to n numbers and calculate the sum of its difference
        for(int i=0; i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    public int reverseNumber(int n){
        int total = 0;
        while(n!=0){ // willne till b becomes 0
            int a = n%10; // get last num of n
            total = total*10+a; // total left and the last num
            n/=10; //remove
        }
        return total;
    }

    public boolean isArmstrongNumber(int n) {
        int sum = 0;
        int nums = 0;
        int t = n; // it's just a n

        // Count the number of nums
        while (t > 0) {
            t /= 10;
            nums++;
        }

        // reset t back to n to calculate the sum of the powers
        t = n;
        while (t > 0) {
            int num = t % 10; // get the last digit
            int degree = 1;

            // Calculate digit raised to the power of nums
            for (int i = 0; i < nums; i++) {
                degree *= num;
            }

            sum += degree; // Add the powered digit to the sum
            t /= 10; // Remove the last digit
        }

        // Compare the sum to the original number n
        return sum == n; // Use n for comparison
    }


    public int nextPrime(int n){
        int a=n+1; //starts checking from the next num after n
        while(!isPrime(a)){  // continue loopng till a prime will be found
            a++;// increment a to check next num
        }
        return a;
    }
}
