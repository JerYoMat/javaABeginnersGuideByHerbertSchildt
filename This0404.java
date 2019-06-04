class ThisPower {
  double b;
  int e;
  double val;

  //constructor
  ThisPower(double base, int exp) {
    b = base; // shorthand for this.b
    e = exp;  // and this.e the this is implicit
    val = 1;
    if (exp==0) return;
    for ( ; exp>0; exp--) val*=base;
  }
  double get_pwr() {
    return val;
  }
}

class UsingPower {
  public static void main(String args[]) {
    ThisPower x = new ThisPower(4.0, 2);
    ThisPower y = new ThisPower(2.5, 1);
    ThisPower z = new ThisPower(5.7, 0);

    System.out.println(x.b + " raised to the " + x.e + " power is " + x.get_pwr());
    System.out.println(y.b + " raised to the " + y.e + " power is " + y.get_pwr());
    System.out.println(z.b + " raised to the " + z.e + " power is " + z.get_pwr());
  }
}