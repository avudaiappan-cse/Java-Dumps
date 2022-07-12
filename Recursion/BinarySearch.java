package Recursion;

public class BinarySearch {

  public static int binarySearch(int[] arr, int low, int high, int x) {
    if (low > high) return -1;
    int mid = (low + (high - low) / 2);
    if (arr[mid] == x) {
      return mid;
    } else if (arr[mid] < x) {
      return binarySearch(arr, mid + 1, high, x);
    } else {
      return binarySearch(arr, low, mid - 1, x);
    }
  }

  public static void main(String args[]) {
    int[] arr = { 1, 4, 100, 356, 1029, 4565, 10024 };
    System.out.println(binarySearch(arr, 0, arr.length - 1, 10989));
  }
}
