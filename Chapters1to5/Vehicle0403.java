class Vehicle {
  int passengers;
  int fuelcap;
  int mpg;
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
}

class VehicleDemo {
  public static void main(String args[]){
    Vehicle sportscar = new Vehicle(2, 14, 12);
    double gallons;
    int dist = 252;

    gallons = sportscar.fuelRequirement(dist);
    System.out.println("You need " + gallons + " gallons of fuel.");

  }
}