class TwoDimArray {
  public static void main(String args[]) {
    int w, h;
    int table[][] = new int[3][4];

    for (w=0; w<3; ++w) {
      for (h=0; h<4; ++h) {
        table[w][h] = (w*4) + h + 1;
        System.out.print(table[w][h] + " ");
      }
      System.out.println();
    }
  }
}

//Prints a table with 1 through 12.  The increment ahead of the variable covers 0