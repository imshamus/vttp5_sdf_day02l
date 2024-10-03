package object;

public class Desktop extends Computer{
    
    private String operatingSystem;
    private Integer weight;
    private Boolean waterCooling;

    public Desktop() {
    } // empty constructor

    public Desktop(String cpu, String model, Integer ram, Integer year, String operatingSystem, Integer weight,
            Boolean waterCooling) {
        super(cpu, model, ram, year);
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.waterCooling = waterCooling;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean getWaterCooling() {
        return waterCooling;
    }

    public void setWaterCooling(Boolean waterCooling) {
        this.waterCooling = waterCooling;
    }

    @Override
    public void displaySpec() {
        System.out.println("This desktop specs: ");
        System.out.println(this.getModel());
        System.out.println(this.getCpu());
        System.out.println(this.getRam());
        System.out.println(this.getYear());
        System.out.println(this.getOperatingSystem());
        System.out.println(this.getWeight());
        System.out.println("Water cooling system: " + this.getWaterCooling());
        
    }

    

    



}
