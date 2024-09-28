//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Call the isPrime method without creating an object;
        System.out.println("Prime:" + MathUtil.isPrime(7));

//        Call the gcd method without creating an object;
        System.out.println("GCD:" + MathUtil.gcd(14,28));

//        Call the methods without creating an object
        System.out.println("LCM:" + MathUtil.lcm(3,4));

//        Call the fib method without creating an object;
        System.out.println("Fibonacci:" + MathUtil.fibonacci(10));

//        call the ! without creating an object
        System.out.println("Factorial:" + MathUtil.factorial(5));

//        Creating an object
        MathUtil math = new MathUtil();
        System.out.print("Perfect:" + math.isPerfectNumber(5));
        System.out.print("Sum:");
        System.out.print("Reverse:");

    }
}