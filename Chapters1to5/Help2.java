class Help2 {
  public static void main(String args[])
    throws java.io.IOException {
      char choice, ignore;

      do {
        System.out.println("Help on:");
        System.out.println("\t1. if");
        System.out.println("\t2. switch");
        System.out.println("\t3. for");
        System.out.println("\t4. while");
        System.out.println("\t5. do-while\n");
        System.out.print("Enter a number between 1 and 5 or q to quit:\n");
        choice = (char) System.in.read();
        if (choice == 'q') break;
        do {
          ignore = (char) System.in.read();
        } while (ignore != '\n');
        /* The nested do is used to discard any unwanted characters as read inputs are line buffered and unless its between 1 and 5 you want to dump it. */
        
      } while ( choice < '1' | choice > '5');

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
        case '3':
          System.out.println("The for: \n");
          System.out.println("for(init; condition; iteration)");
          System.out.println(" statement;");
          break;
        case '4':
          System.out.println("The while: \n");
          System.out.println("while(condition) statement;");
          break;
        case '5':
          System.out.println("The do-while: \n");
          System.out.println(" do {");
          System.out.println("  statement;");
          System.out.println("} while (condition);");
          break;
      } 
  }
}