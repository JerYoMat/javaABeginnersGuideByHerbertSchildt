class LifetimeOfVar {
  public static void main (String args[]) {
    int x;
    for (x = 0; x< 3; x++) {
      int y = -1;
      System.out.println("y is: " + y);
      y = 100;
      System.out.println("y is now: " + y);
    }
  }
}

/* One wrinkle: No variable declared within an inner scope can have the same name as a variable declared by an enclosing scope.  */