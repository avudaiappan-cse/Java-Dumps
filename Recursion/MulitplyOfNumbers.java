package Recursion;

public class MulitplyOfNumbers {

  public static int multiplyOfTwoNumbers(int n, int m) {
    if (m == 0) return 0;
    return n + multiplyOfTwoNumbers(n, m - 1);
  }

  public static void main(String args[]) {
    System.out.println(multiplyOfTwoNumbers(3, 4));
  }
}
