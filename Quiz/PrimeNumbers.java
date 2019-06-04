class PrimeNumbers {
  public static void main(String args[]) {
    int i, c;
    boolean prime;
    for (i = 2; i < 101; i++) {
      prime = true;
      for (c = (i - 1); c > 1; c--) {
        if (i % c == 0) prime = false;
      }
      if (prime == true) System.out.println(i + " is prime");
    }
  }
}