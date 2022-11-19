public class Droid {
  String name;
  int batteryLevel;

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;
    }
  public void energyReport(int energy){
    System.out.println(name + " has a battery level of " + batteryLevel);
    batteryLevel = batteryLevel - 36;
    System.out.println(batteryLevel);
    }  
  public String toString(){
    return "Hello, I’m the droid: " + name;
  }

  public static void main(String[ ] args){
    Droid codey = new Droid ("codey");
    System.out.println(codey);
    codey.performTask("running");
    codey.performTask("singing");  
    Droid david = new Droid("David");
    david.energyReport(36);
  }
}
