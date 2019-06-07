class MethodOverload {
  void ovlDemo() {
    System.out.println("Nada");
  }
  void ovlDemo(int a) {
    System.out.println("One paramater: " + a);
  }
  int ovlDemo(int a, int b) {
    System.out.println("Two parameters " + a + " " + b);
    return a + b;
  }

  double ovlDemo(double a, double b) {
    System.out.println("Two parameters " + a + " " + b);
    return a + b;
  }

}

class OverloadDemo {
  public static void main(String args[]) {
    MethodOverload ob = new MethodOverload();
    int resiI;
    int resiD;

    ob.ovlDemo();
    System.out.println();

    ob.ovlDemo(2);
    System.out.println();

    ob.ovlDemo(4, 6);
    System.out.println();

    ob.ovlDemo(8.00, 9.00);
    System.out.println();



  }
}