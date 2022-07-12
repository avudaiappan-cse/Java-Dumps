package Recursion;

public class MergeSort {

  public static void mergeSort(int[] arr) {
    if (arr.length == 0 || arr.length == 1) return;
    int mid = arr.length / 2;
    int[] s1 = new int[mid];
    int[] s2 = new int[arr.length - mid];
    for (int i = 0; i < mid; i++) {
      s1[i] = arr[i];
    }
    for (int i = mid; i < arr.length; i++) {
      s2[i - mid] = arr[i];
    }
    mergeSort(s1);
    mergeSort(s2);
    int i = 0, j = 0, idx = 0;
    while (i < s1.length && j < s2.length) {
      if (s1[i] < s2[j]) {
        arr[idx] = s1[i];
        i++;
        idx++;
      } else {
        arr[idx] = s2[j];
        j++;
        idx++;
      }
    }
    while (i < s1.length) {
      arr[idx] = s1[i];
      idx++;
      i++;
    }
    while (j < s2.length) {
      arr[idx] = s2[j];
      idx++;
      j++;
    }
  }

  public static void main(String args[]) {
    int[] sample = { 32, 12, 35, 122, 45 };
    mergeSort(sample);
    for (int i = 0; i < sample.length; i++) {
      System.out.print(sample[i] + " ");
    }
  }
}
