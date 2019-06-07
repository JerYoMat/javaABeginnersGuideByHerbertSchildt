class GenSuperClass {
  String name;
  GenSuperClass(String n) {
    name = n;
  }
  void from() {
    System.out.println("From Super");
  }
}

class GenSubClass extends GenSuperClass {
  int age;
  GenSubClass(String n, int i) {
    super(n);
    age = i;
  }
  void from() {
    System.out.println("From sub");
  }
}

class DynamicMethodDispatchDemo {
  public static void main(String args[]) {
    GenSuperClass sup = new GenSuperClass("joe");
    GenSubClass sub = new GenSubClass("arthur", 2);
    
    GenSuperClass superRef;
    superRef = sup;
    superRef.from();

    superRef = sub;
    superRef.from();
    //even though ref is to sub, superRef has not knowledge of name.
    // however, from should run from sub and not super

  }
}