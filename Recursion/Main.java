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

  public static boolean isSorted(int[] arr) {
    if (arr.length == 1) return true;
    if (arr[0] > arr[1]) return false;
    int[] newArray = new int[arr.length - 1];
    for (int i = 1; i < arr.length; i++) {
      newArray[i - 1] = arr[i];
    }
    boolean isNewArraySorted = isSorted(newArray);
    return isNewArraySorted;
  }

  public static boolean isSortedEnhanced(int[] arr, int startIdx) {
    if (startIdx == arr.length - 1) return true;
    if (arr[startIdx] > arr[startIdx + 1]) return false;
    return isSortedEnhanced(arr, startIdx + 1);
  }

  public static int sumOfArray(int[] arr) {
    if (arr.length == 0) return 0;
    if (arr.length == 1) return arr[0];
    int[] newSubArray = new int[arr.length - 1];
    for (int i = 1; i < arr.length; i++) {
      newSubArray[i - 1] = arr[i];
    }

    return arr[0] + sumOfArray(newSubArray);
  }

  public static boolean isNumberPresent(int[] arr, int element) {
    if (arr.length == 1) return arr[0] == element;
    int[] newSubArray = new int[arr.length - 1];
    for (int i = 1; i < arr.length; i++) {
      newSubArray[i - 1] = arr[i];
    }
    return arr[0] == element || isNumberPresent(newSubArray, element);
  }

  public static int findIndex(int[] arr, int element, int startIdx) {
    if (startIdx == arr.length - 1) return arr[startIdx] == element
      ? startIdx
      : -1;
    if (arr[startIdx] == element) return startIdx;
    return findIndex(arr, element, startIdx + 1);
  }

  public static int findLastIndex(
    int[] arr,
    int element,
    int startIdx,
    int memoIdx
  ) {
    if (startIdx == arr.length - 1) {
      if (arr[startIdx] == element) memoIdx = startIdx;
      return memoIdx;
    }
    if (arr[startIdx] == element) memoIdx = startIdx;
    return findLastIndex(arr, element, startIdx + 1, memoIdx);
  }

  public static void main(String args[]) {
    System.out.println(fact(5));
    System.out.println(power(2, 0));
    System.out.println(sumOfNaturalNumbers(100));
    System.out.println(numOfDigits(125));
    System.out.println(sumOfDigits(34));
    System.out.println(fibonacci(3));
    int[] array = { 1, 2, 3, 4, 5, 1 };
    System.out.println(isSorted(array));
    System.out.println(isSortedEnhanced(array, 0));
    System.out.println(sumOfArray(array));
    System.out.println(isNumberPresent(array, 4));
    System.out.println(findIndex(array, 1, 0));
    System.out.println(findLastIndex(array, 1, 0, -1));
  }
}
