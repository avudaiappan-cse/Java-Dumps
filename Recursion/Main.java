package Recursion;

public class Main {

  public static int fact(int n) {
    if (n == 0) return 1;
    return n * fact(n - 1);
  }

  public static int power(int base, int exponent) {
    if (exponent == 0) return 1;
    return base * power(base, exponent - 1);
  }

  public static int sumOfNaturalNumbers(int n) {
    if (n <= 0) return 0;
    return n + sumOfNaturalNumbers(n - 1);
  }

  public static int numOfDigits(int digit) {
    if (digit == 0) return 0;
    return 1 + numOfDigits(digit / 10);
  }

  public static int sumOfDigits(int number) {
    if (number == 0) return 0;
    return number % 10 + sumOfDigits(number / 10);
  }

  public static int fibonacci(int n) {
    if (n == 1 || n == 2) {
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String args[]) {
    System.out.println(fact(5));
    System.out.println(power(2, 0));
    System.out.println(sumOfNaturalNumbers(100));
    System.out.println(numOfDigits(125));
    System.out.println(sumOfDigits(34));
    System.out.println(fibonacci(3));
  }
}
