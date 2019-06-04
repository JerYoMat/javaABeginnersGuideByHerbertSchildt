class ForVariantOne {
  public static void main(String args[]) {
    int i, j;

    for (i=0, j=10; i < j; i++, j-- ) // if two vars in initialization then , not ;
      System.out.println("i and j: " + i + " " + j);
  }
}