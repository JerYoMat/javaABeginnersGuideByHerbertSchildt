class MyClass {
  private int i;
  
  MyClass(int k) { i = k;}

  int geti() { return i;}
  void seti(int k) { if(k >= 0) i = k;}
}

class VarDemo {
  public static void main(String args[]) {
    var mc = new MyClass(10);
    System.out.println("Value of i in mc is " + mc.geti());
    mc.seti(2 * mc.geti());
    System.out.println("The Value of i in mc has been doubled to: " + mc.geti());
  }
}