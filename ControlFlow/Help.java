class Help {
  public static void main(String args[])
    throws java.io.IOException {
      char choice;

      System.out.println("Help on:");
      System.out.println("\t1. if");
      System.out.println("\t2. switch");
      choice = (char) System.in.read(); // this will read as a number so thats why cast is needed to bring back to Character

      System.out.println("\n");

      switch(choice) {
        case '1':
          System.out.println("The if:\n");
          System.out.println("if(condition) statement;");
          System.out.print("else statement;");
          break;
        case '2':
          System.out.println("The switch:\n");
          System.out.println("switch(expression) {\n");
          System.out.println("\tcase constant:");
          System.out.println("\t\tstatement sequence");
          System.out.println("\t\tbreak;");
          System.out.println("\t //rinse repeat...");
          System.out.println("\tdefault:\n...");
          System.out.println("}");
          break;
        default:
          System.out.print("Selection not found.");
    }
  }
}