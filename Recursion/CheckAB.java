package Recursion;

public class CheckAB {

  public static boolean checkAB(String str) {
    if (str.length() == 0) return true;
    if (str.charAt(0) != 'a') return false;
    if (str.length() >= 3 && str.substring(0, 3).equals("abb")) {
      return true && checkAB(str.substring(3));
    } else {
      return checkAB(str.substring(1));
    }
  }

  public static void main(String args[]) {
    System.out.println(checkAB("abbaabb"));
  }
}
