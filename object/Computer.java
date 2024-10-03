package object;
public class Computer {
    // public static void main (string[] args) {} only to print smth out, only for the main class
    private String cpu; //can be public slide 9, public = can use .cpu to show but not best practice
    private String model;
    private Integer ram;
    private Integer year;

     
    public Computer() {
        this.cpu = "2GHz dual core";
        this.model = "Gigabyte 1000";
        this.ram = 16;
        this.year = 2020; // default values for empty contructor
    }

    public Computer(String cpu, String model, Integer ram, Integer year) {
        this.cpu = cpu;
        this.model = model;
        this.ram = ram;
        this.year = year; //pass in values, more efficient way of doing
    }

   
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    public void startup() {
        System.out.println("Computer powered up...");
    }

    public void shutdown() {
        System.out.println("Shutting down Computer...");
    }

    public void displaySpec() {

        System.out.println("This computer specs: ");
        System.out.println(this.model);
        System.out.println(this.cpu);
        System.out.println(this.ram);
        System.out.println(this.year);

    }
}
