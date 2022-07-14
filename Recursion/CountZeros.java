package Recursion;

public class CountZeros {

  public static int countZeros(int num) {
    if (num >= 1 && num <= 9) return 0;
    if (num == 0) return 1;
    if (num % 10 == 0) return 1 + countZeros(num / 10);
    return 0 + countZeros(num / 10);
  }

  public static void main(String args[]) {
    System.out.println(countZeros(30452032));
  }
}
