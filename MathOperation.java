package com.subitech.java.math.operation;

import java.util.Scanner;

public class MathOperation {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // get first number from user
    System.out.println("Enter First Number: ");

    int fn = sc.nextInt();

    // get second number from user
    System.out.println("Enter Second Number: ");

    int sn = sc.nextInt();

    // close scanner class
    sc.close();

    // do math operation
    int sum = fn + sn;
    int sub = fn - sn;
    int multi = fn * sn;
    int div = fn / sn;
    int mod = fn % sn;

    // print answer
    System.out.println("\n\nANSWERS\n");
    System.out.println(fn + " + " + sn + " = " + sum);
    System.out.println(fn + " - " + sn + " = " + sub);
    System.out.println(fn + " * " + sn + " = " + multi);
    System.out.println(fn + " / " + sn + " = " + div);
    System.out.println(fn + " % " + sn + " = " + mod);
  }
}
