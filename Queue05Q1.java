class Queue { //a noncircular queue
  char q[];  //ary holds the queue
  int putLocation, getLocation;

  Queue(int size) {
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
