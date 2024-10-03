package vehicle;

public interface IVehicle {// what's interface(?)

public void start(); // no implementation only method signature, i.e. method names
public void stop();
public void accelerate(Integer increment);
public void brake(Integer decrement);
public void honk();
    
}
