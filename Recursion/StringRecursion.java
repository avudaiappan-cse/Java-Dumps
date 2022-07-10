package Recursion;

public class StringRecursion {

  public static String replaceCharacter(String s, char x, char y) {
    if (s.length() == 0) return s;
    String newSubString = replaceCharacter(s.substring(1), x, y);
    if (s.charAt(0) == x) return y + newSubString;
    return s.charAt(0) + newSubString;
  }

  public static String removeCharacter(String s, char x) {
    if (s.length() == 0) return s;
    String newSubString = removeCharacter(s.substring(1), x);
    if (s.charAt(0) == x) return newSubString;
    return s.charAt(0) + newSubString;
  }

  public static String removePattern(String s, String pattern) {
    if (s.length() < pattern.length()) return s;
    if (s.startsWith(pattern)) {
      return removePattern(s.substring(pattern.length()), pattern);
    }
    return s.charAt(0) + removePattern(s.substring(1), pattern);
  }

  public static String removeRecurringCharacter(String s) {
    if (s.length() == 0) return s;
    int idx = 1;
    while (idx < s.length() && s.charAt(idx) == s.charAt(0)) {
      idx++;
    }
    return s.charAt(0) + removeRecurringCharacter(s.substring(idx));
  }

  public static void main(String args[]) {
    String sentence = "He";
    char character = 's';
    char replaceCharacter = 'x';
    String newString = replaceCharacter(sentence, character, replaceCharacter);
    System.out.println(newString);
    System.out.println(removeCharacter("avxxsdf", 'x'));
    System.out.println(removePattern("pithispiandpi", "and"));
    System.out.println(removeRecurringCharacter("aaaxxxyyyyzzz"));
  }
}
