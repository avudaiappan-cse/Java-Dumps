package Recursion;

public class Palindrome {

  public static boolean checkPalindrome(String str, int startIdx, int endIdx) {
    if (startIdx >= endIdx) return true;
    return (
      str.charAt(startIdx) == str.charAt(endIdx) &&
      checkPalindrome(str, startIdx + 1, endIdx - 1)
    );
  }

  public static boolean checkPalindrome(String str) {
    if (str.length() == 0 || str.length() == 1) return true;
    boolean currentComparison = str.charAt(0) == str.charAt(str.length() - 1);
    String subString = str.substring(1, str.length() - 1);
    return currentComparison && checkPalindrome(subString);
  }

  public static void main(String args[]) {
    System.out.println(checkPalindrome("ninja"));
    System.out.println(checkPalindrome("racecar", 0, 6));
  }
}
