package Recursion;

public class QuickSort {

  public static int partition(int[] arr, int startIdx, int endIdx) {
    int pivotElement = arr[startIdx], count = 0;
    for (int i = startIdx + 1; i <= endIdx; i++) {
      if (arr[i] < pivotElement) count++;
    }
    int temp = arr[startIdx + count];
    arr[startIdx + count] = pivotElement;
    arr[startIdx] = temp;
    int i = startIdx, j = endIdx;
    while (i < j) {
      if (arr[i] < pivotElement) {
        i++;
      } else if (arr[j] >= pivotElement) {
        j--;
      } else {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }
    return startIdx + count;
  }

  public static void quickSort(int[] arr, int startIdx, int endIdx) {
    if (startIdx >= endIdx) return;
    int pivotIdx = partition(arr, startIdx, endIdx);
    quickSort(arr, startIdx, pivotIdx - 1);
    quickSort(arr, pivotIdx + 1, endIdx);
  }

  public static void main(String args[]) {
    int[] arr = { 3124, 123, 124, 35, 1, 7, 343 };
    quickSort(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length - 1; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
