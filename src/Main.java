//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Call the isPrime method without creating an object;
        System.out.println("1. Prime:" + MathUtil.isPrime(7));

//        Call the gcd method without creating an object;
        System.out.println("2. GCD:" + MathUtil.gcd(14,28));

//        Call the methods without creating an object
        System.out.println("3. LCM:" + MathUtil.lcm(3,4));

//        Call the fib method without creating an object;
        System.out.println("4. Fibonacci:" + MathUtil.fibonacci(10));

//        call the ! without creating an object
        System.out.println("5. Factorial:" + MathUtil.factorial(5));

//        Creating an object
        MathUtil math = new MathUtil();
        System.out.print("6. Perfect:" + math.isPerfectNumber(5));
        System.out.print("7. Sum:" + math.sumOfDigits(10));
        System.out.print("8. Reverse:" + math.reverseNumber(234));
        System.out.print("9. Armstrong:" + math.isArmstrongNumber(407));
        System.out.print("10. Next prime:" + math.nextPrime(11));
    }
}