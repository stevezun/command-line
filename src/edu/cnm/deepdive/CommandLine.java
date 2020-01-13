package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CommandLine {

  public static void main(String[] args) {
    Double[] data = read();
    System.out.println( Arrays.toString(data));
    double total = sum(data);
    System.out.println( total );
  }

  private static int[] parse(String[] args) {
    int[] values = new int[args.length];
    for (int i = 0 ; i < args.length; i++) {
      values[i] = Integer.parseInt( args[i] );
    }
    return values;
  }

  private static double sum(Double[] data) {
    double total = 0;
    for (int i = 0; i < data.length; i++) {
      total += data[i];
    }
    return total;
  }

  private static Double[] read() {
    Double[] data = null;
    Scanner scanner = new Scanner(System.in);
    List<Double> input = new LinkedList<>();
    while (true) {
      try {
        input.add(scanner.nextDouble());
      } catch (NoSuchElementException e) {
        break;
      }
    }
    data = input.toArray(new Double[0]);
    return data;
  }
}
