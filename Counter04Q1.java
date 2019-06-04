class Counter {
  int counterValue;
  int countBy;

  Counter(int start, int incr) {
    counterValue = start;
    countBy = incr;
  }

  void prompt() {
    System.out.println("Press ENTER to increment the counter.");
  }

  void showCount() {
    System.out.println("The counter is at: " + counterValue + "." );
  }

  void incrementCount() {
    counterValue += countBy;
  }
}

class CountOnEnter {
  public static void main(String args[]) throws java.io.IOException {
    char choice;
    Counter dweebyCounter = new Counter(0, 1);

    for (;;) {
      do {
        dweebyCounter.prompt();
        choice = (char) System.in.read();
        if (choice == 'q')
          return;
      } while (choice != '\n');
      dweebyCounter.incrementCount();
      dweebyCounter.showCount();
    }
  }
}
