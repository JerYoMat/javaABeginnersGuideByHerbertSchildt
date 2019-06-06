// demonstrate dif between public and private by preventing boundary errors when working with an array.
class FailSoftArray {
  private int a[];
  private int errval;
  public int length;

  public FailSoftArray(int size, int errv) {
    a = new int[size];
    errval = errv;
    length = size;
  }

  private boolean indexOK(int index) {
    if (index >= 0 & index < length) return true;
    return false;
  }

  public int get(int index) {
    if (indexOK(index)) return a[index];
    return errval;
  }
  public String notinrange(int i) {
    return i + " is not in range";
  }

  public boolean put(int index, int val) {
    if (indexOK(index)) {
      a[index] = val;
      return true;
    }
    return false;
  }
}

class AccessControlDemo {
  
  public static void main(String args[]) {
    FailSoftArray fs = new FailSoftArray(5, -1);
    int x;

    //add some bs data
    for (int i = 0; i<fs.length; i++)
      fs.put(i, i);


    System.out.println("mark when out of range");
    for (int i=-5; i<fs.length + 5; i++) {
      x = fs.get(i);
      System.out.println((x != (-1)) ? x : fs.notinrange(i));
    }
  }
}