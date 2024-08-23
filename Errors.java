// This code is riddled with errors.
// Please find and fix all of the errors without changing the intended purpose of the code.

Public class Error{
  public static main(string[] args){
    String name = "Alan";
    String animal = "duck";
    System.out.println("My name is " + name + " and I am a " + animal + ".");

    double weight = 90.0;
    double volume = 8.0;
    double density = weight/volume; // Should be the correct precise value.

    System.out.println("I am a heavy " + animal + " because I have a density of " + density + " kilograms per cubic centimeter.");

    System.out.println("It was nice meeting you!");
  }
}
