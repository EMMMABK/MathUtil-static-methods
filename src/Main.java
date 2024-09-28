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
//        If my answer is not correct, i just didn't understand how to solve fibonacci
        System.out.println("Fibonacci:" + MathUtil.fibonacci(3473));
    }
}