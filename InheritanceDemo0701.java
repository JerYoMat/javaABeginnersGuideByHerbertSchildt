// vehicle will be super of truck
class Vehicle {
  private int passengers;
  private int fuelcap;
  private int mpg;  
  // constructor
  Vehicle (int p, int f, int m) {
    passengers = p;
    fuelcap = f;
    mpg = m;
  }

  int range() {
    return mpg * fuelcap;
  }

  double fuelRequirement(int miles) {
    return (double) miles / mpg;
  }

  int getPassengers() { return passengers;}
  void setPassengers(int p) { passengers = p;}
  int getFuelCap() { return fuelcap; }
  void setFuelCap(int f) { fuelcap = f; }
  int getMpg() { return mpg; }
  void setMpg(int m) { mpg = m;}

}

class Truck extends Vehicle {
  private int cargocap;

  Truck(int p, int f, int m, int c) {
    super(p, f, m); // this uses Vehicle's constructor to set p f and m
    cargocap = c;
  }

  public int getCargo() { return cargocap; }
  public void setCargo(int c) { cargocap = c;}

}

class InheritanceDemo {
  public static void main(String args[]) {
    Truck genTruck = new Truck(2, 200, 7, 4400);
    double gallons;

    int distance = 125;

    gallons = genTruck.fuelRequirement(distance);

    System.out.println("This generic truck can carry " + genTruck.getCargo() + " units of whatever");
    System.out.println("To cover the " + distance + " miles the truck needs " + gallons + " of fuel");
  }
}