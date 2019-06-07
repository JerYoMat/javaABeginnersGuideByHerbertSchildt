class QuickSort {
  //This implementation of quicksort will use the middle value of the array as comparand.  

  // this sets up a call to the actual quicksort method qs so that the array can just be passed in. 
  static void qsort(char items[]) {
    qs(items, 0, items.length-1);
  }

  private static void qs(char items[], int left, int right) {
    int i, j;
    char x, y;
    i = left;
    j = right;
    x= items[(left+right)/2];  // the comparand?

    do {
      while((items[i] < x) && (i < right)) i++;
      while((x < items[j]) && (j > left)) j--;

      if( i <= j) {
        y = items[i];
        items[i] = items[j];
        items[j] = y;
        i++; j--;
      }
    } while (i <= j);

    if(left < j) qs(items, left, j);
    if(i < right) qs(items, i, right);
  }
}

class QSDemo {
  public static void main(String args[]) {
    char a[] = { 'd', 'c', 'b', 'a', 'z', 'x', 'y'};
    int i;

    System.out.print("Original array: ");
    for (i=0; i<a.length; i++)
      System.out.print(a[i]);
    System.out.println();

    QuickSort.qsort(a);

    System.out.print("Sorted array: ");
    for (i=0; i<a.length; i++)
      System.out.print(a[i]);

  }
}