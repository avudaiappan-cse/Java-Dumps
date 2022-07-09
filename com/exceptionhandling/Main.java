package com.exceptionhandling;

public class Main {

  public static void main(String args[]) {
    try {
      String s = null;
      System.out.println(s.length());
      System.out.println(5 / 0);
    } catch (NullPointerException npe) {
      System.out.println(npe.getMessage());
    } catch (ArithmeticException ae) {
      System.out.println(ae.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Im in Main!");
    }
  }
}
