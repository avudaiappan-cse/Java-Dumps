package com.exceptionhandling;

import com.exceptionhandling.CustomException;

public class HandlingException {

  public static int Division(int numerator, int denominator)
    throws ArithmeticException, CustomException {
    if (denominator == 0) {
      throw new ArithmeticException("We can't do that here!");
    } else {
      throw new CustomException(
        "This is Dummy Exception, I forced to do it! No Logic :("
      );
    }
    // return numerator / denominator;
  }

  public static void main(String args[]) {
    try {
      HandlingException.Division(5, 5);
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } catch (CustomException e) {
      System.out.println(e.getMessage());
    }
  }
}
