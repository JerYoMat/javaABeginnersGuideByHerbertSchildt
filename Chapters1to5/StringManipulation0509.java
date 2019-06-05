class StringOps {
  public static void main(String args[]) {
    String str1 = "I really like Java but need to get used to not using single quotes and not having everything be enclosed in brackets.";
    String str2 = new String(str1);
    String str3 = "Looks like there is a whole lot more to this class";
    int result, idx;
    char ch;

    System.out.println("Using length to determine the length of str1=" + str1.length());
    System.out.println("The third character in str1 is: "+ str1.charAt(3));

    result = str1.compareTo(str3);
    if (result == 0)
      System.out.println("result = str1.compareTo(str3): result equals 0");
    else 
      System.out.println("result = str1.compareTo(str3) now the variable result is equal to: " + result);
    
      str2="Strings can have new values assigned and here is another can";

      idx = str2.indexOf("can");
      System.out.println("str2 is currently set to: " + str2);
      System.out.println("str2.indexOf(\"can\") is: " + idx);
      idx = str2.lastIndexOf("can");
      System.out.println("the index of the last occurrence of can is: " + idx);

  }
}