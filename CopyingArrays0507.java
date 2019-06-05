class CopyingArrays {
  public static void main(String args[]) {
    int i;
    int nums1[] = new int[10];
    int nums2[] = new int[10];

    for (i=0; i<nums1.length; i++) 
      nums1[i] = i;
    
    //the copying bit
    if(nums2.length >= nums1.length) //check that you won't run over the array boundary
      for (i=0; i<nums1.length; i++) 
        nums2[i] = nums1[i];
    // end of copy bit

    for (i=0; i<nums2.length; i++)
      System.out.print(nums2[i] + " ");
  }
}