class MinMax {
  public static void main(String args[]) {
    int nums[] = { 1, 2, 3, 4, 5};
    int min, max;

    min = max = nums[0]; // set both min and max to an initial value then iterate through to see if it should be changed. 
    for (int i=1; i<5; i++) {
      if (nums[i] < min) min = nums[i];
      if (nums[i] > max) max = nums[i];
    }
    System.out.println("Min and max: " + min + " " + max);

  }
}