package edu.cnm.deepdive;

public class CommandLine {

  public static void main(String[] args) {
    int[] vals = parse( args );
    int total = sum(vals);
    System.out.println( total );
  }

  private static int[] parse(String[] args) {
    int[] values = new int[args.length];
    for (int i = 0 ; i < args.length; i++) {
      values[i] = Integer.parseInt( args[i] );
    }
    return values;
  }

  private static int sum(int[] data) {
    int total = 0;
    for (int = 0; i < data.length; i++) {
      total += data[i];
    }
    return total;
  }
}
