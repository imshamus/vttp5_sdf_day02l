package vehicle; // small caps (?)

public class Vehicle implements IVehicle { // implement the interface

    private String model;
    private String make;
    private Integer year;
    private Integer speed; // i dont need the setter cause accelerate and brake will increase/decrease speed. need getter to displahy speed somewhere

    public Vehicle(String model, String make, Integer year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed; // cause speed is defined as integer 
    }

    @Override // technically overiding the interface in IVehicle
    public void start() {
        System.out.println("Vehicle started..");
    }

    @Override
    public void stop() {
        this.speed = 0;
        System.out.println("Vehicle stopped..");
    }

    @Override
    public void accelerate(Integer increment) {
       this.speed = this.speed + increment; // why must add this?
    }

    @Override
    public void brake(Integer decrement) {
       this.speed = this.speed - decrement;
    }

    @Override
    public void honk() {
        System.out.println("Vehicle honked...");
    }

    
}
