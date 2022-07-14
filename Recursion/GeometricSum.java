package Recursion;

public class GeometricSum {

  public static double findGeometricSum(int k, int n) {
    if (n == k) return 1 / (Math.pow(2, n));
    double pow = Math.pow(2, n);
    return 1 / pow + findGeometricSum(k, n + 1);
  }

  public static double findGeometricSum(int k) {
    return findGeometricSum(k, 0);
  }

  public static void main(String args[]) {
    System.out.println(findGeometricSum(4));
  }
}
