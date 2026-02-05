
/**
 * Write a description of class MobilePhone here.
 *
 * @author (24BIA023)
 * @version (5/2/2026)
 */
public class MobilePhone
{
    private String brand;
    private String model;
    private double price;
    private int batteryLevel;
    private boolean isOn;
    
        public MobilePhone() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0;
        this.batteryLevel = 100;
        this.isOn = false;
    }
    
    public MobilePhone(String brand,String model,double price,int batteryLevel,boolean isOn){
        this.brand = brand;
        this.model = model;
        setPrice(price);
        this.batteryLevel = 100;
        this.isOn = false;
    }
    
    public String getbrand(){
        return brand;}
    
    public String getmodel(){
        return model;}
    
    public double getprice(){
        return price;}
    
    public int getbatteryLevel(){
        return batteryLevel;}
    
    public boolean getisOn(){
        return isOn;}
    
        public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be positive");
        }
    }
    
        public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            System.out.println("Battery level must be between 0 and 100");
        }
    }
    
        public void turnOn() {
        if (batteryLevel > 0) {
            isOn = true;
            System.out.println("Phone is ON");
        } else {
            System.out.println("Phone is OFF");
        }
    }
    
       public void turnOff() {
        isOn = false;
        System.out.println("Phone is OFF.");
    }
    
    public void makeCall(String contactName){
    if (isOn == true) {
        System.out.println("Calling " + contactName);
        batteryLevel = batteryLevel - 5;
    }else {
        System.out.println("Cannot make call");
        }
    }
    
    public void chargeBattery(int minutes) {
    batteryLevel += minutes * 2;

    if (batteryLevel > 100)
        batteryLevel = 100;
    }

    
        public void displayInfo(){
        System.out.println("----- Phone Information -----");
        System.out.println("Brand        : " + brand);
        System.out.println("Model        : " + model);
        System.out.println("Price        : " + price + " TZS");
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("Power Status : " + (isOn ? "ON" : "OFF"));
        System.out.println("-----------------------------");
    }
    
        public static void main(String[] args) {
        System.out.println("=== Mobile Phone Exercise ===\n");
        
        MobilePhone phone1 = new MobilePhone();
        phone1.displayInfo();

        MobilePhone phone2 = new MobilePhone("Infinix", "Smart7", 2500000,25,true);

        phone2.turnOn();
        
        phone2.makeCall("Lucas");
        phone2.makeCall("Brayan");
        phone2.makeCall("Shedrack");
        
        phone2.displayInfo();
        
        phone2.chargeBattery(40);

        phone2.displayInfo();

        System.out.println("\n=== Exercise Complete ===");
    }
}
    
