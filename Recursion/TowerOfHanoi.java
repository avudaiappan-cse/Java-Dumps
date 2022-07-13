package Recursion;

public class TowerOfHanoi {

  public static void towerOfHanoi(
    int numOfDisk,
    char start,
    char helper,
    char destination
  ) {
    if (numOfDisk == 0) return;
    if (numOfDisk == 1) {
      System.out.println("Move 1'st disk from " + start + " to " + destination);
      return;
    }
    towerOfHanoi(numOfDisk - 1, start, destination, helper);
    System.out.println("Move " + start + " to " + helper);
    towerOfHanoi(numOfDisk - 1, helper, start, destination);
  }

  public static void main(String args[]) {
    towerOfHanoi(3, 'A', 'B', 'C');
  }
}
