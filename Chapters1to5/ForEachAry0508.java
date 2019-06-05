class ForEachAry {
  public static void main(String args[]) {
    int sum = 0;
    int nums[][] = new int[3][5];

    // Just assigning each cell a value in order starting with 1
    for (int i=0; i<3; i++)
      for (int j=0; j<5; j++)
        nums[i][j] = (i+1) * (j+1);

    for (int x[] : nums) {  // for each 'row' in nums 
      for ( int y : x){  // for each value in the nested array
        System.out.println("Value is: " + y);
        sum += y;
      }
    }
    System.out.println("Summation: " + sum);
  }
}