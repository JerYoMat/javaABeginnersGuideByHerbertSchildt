class DoWhileDemo {  // runs at least once.
  public static void main(String args[]) 
    throws java.io.IOException {
      
      char ch;

      do {
        System.out.print("Press a key followed by Enter: ");
        ch = (char) System.in.read(); 
      } while (ch != 'q');
    }
}