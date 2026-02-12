/**
 * Write a description of class Person here.
 *
 * @author (24BIA023)
 * @version (12/5/2026)
 */
public class Person {
    private String name;
    private String address;
    
    //constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return "Person[name=" + name + ", address=" + address + "]";
    }



}
