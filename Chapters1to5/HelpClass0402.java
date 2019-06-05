class Help {
  void helpOn(int userInput) {
    switch (userInput) {
    case '1':
      System.out.println("The if:\n");
      System.out.println("\tif(condition) statement;");
      System.out.println("\telse statement;");
      break;
    case '2':
      System.out.println("The switch:\n");
      System.out.println("\tswitch(expression) {\n");
      System.out.println("\t  case constant:");
      System.out.println("\t    statement sequence");
      System.out.println("\t    break;");
      System.out.println("\t    //rinse repeat...");
      System.out.println("\t  default:\n...");
      System.out.println("\t}");
      break;
    case '3':
      System.out.println("The for loop: \n");
      System.out.println("\tfor(init; condition; iteration)");
      System.out.println("\tstatement;");
      break;
    case '4':
      System.out.println("The while loop: \n");
      System.out.println("\twhile(condition) statement;");
      break;
    case '5':
      System.out.println("The do-while loop: \n");
      System.out.println("\tdo {");
      System.out.println("\t  statement;");
      System.out.println("\t} while (condition);");
      break;
    case '6':
      System.out.println("The break:\n");
      System.out.println("\tbreak; or break label;");
      break;
    case '7':
      System.out.println("The continue:\n");
      System.out.println("\tcontinue; or continue label;");
      break;
    }
  }

  void showMenu() {
    System.out.println("Help on:");
    System.out.println("\t1. if");
    System.out.println("\t2. switch");
    System.out.println("\t3. for");
    System.out.println("\t4. while");
    System.out.println("\t5. do-while");
    System.out.println("\t6. break");
    System.out.println("\t7. continue\n");
    System.out.print("Enter a number between 1 and 7 or q to quit:\n");
  }

  void exitHelp() {
    System.out.println("-----Goodbye-----");
  }

  boolean isValid(int ch) {
    if (ch < '1' | ch > '7' & ch != 'q')
      return false;
    else
      return true;
  }
}

class HelpClass {
  public static void main(String args[]) throws java.io.IOException {
    char choice, ignore;
    Help helpObject = new Help();

    for (;;) {
      do {
        helpObject.showMenu();

        choice = (char) System.in.read();
        do {
          ignore = (char) System.in.read();
        } while (ignore != '\n');

      } while (!helpObject.isValid(choice));

      if (choice == 'q') {
        helpObject.exitHelp();
        return;
      } else {
        helpObject.helpOn(choice);
      }

      System.out.println("\n-------------------\n");
      
    }
  }
}