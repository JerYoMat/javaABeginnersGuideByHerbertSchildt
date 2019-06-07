class QueueWithAccess { 
  private char q[];  //ary holds the queue
  private int putLocation, getLocation;

  QueueWithAccess(int size) {
    q = new char[size];  //allocate memory
    putLocation = getLocation = 0;  //both set to 0 as this queue is initialized as empty
  }

  void put(char ch) {
    if(putLocation == q.length) {
      System.out.println(" Get outta here. We full!");
      return;
    }
    q[putLocation++] = ch; //add character to q and then incrment putLocation
  }

  char get() { //no param necessary as you can only take from front
    if (putLocation == getLocation) {
      System.out.println("Nothin in the queue");
      return (char) 0;
    }
    return q[getLocation++];  //what makes this thing non-circular
  }

}

class QueueWithAccessDemo {
  public static void main(String args[]) {
    var Demo = new QueueWithAccess(10);
    Demo.get();
    System.out.println("About to put a char in the queue");
    Demo.put('c');
    System.out.println("Now serving: " + (char) Demo.get());
  }
}