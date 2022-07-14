package Recursion;

public class StringToInteger {

  public static int stringToInteger(String str) {
    if (str.length() == 0) return 0;
    int subStringVal = stringToInteger(str.substring(0, str.length() - 1));
    int val = str.charAt(str.length() - 1) - 48;
    return val + (subStringVal * 10);
  }

  public static void main(String args[]) {
    System.out.println(stringToInteger("12567"));
  }
}
