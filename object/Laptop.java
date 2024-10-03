package object;

public class Laptop extends Computer { //extending from parent slide 12

    private String operatingSystem;
    private Integer weight;
    private String battery;
    private String screenSize;

     //generate constructors
    
    public Laptop() {
    } // empty constructor

    /* public Laptop(String cpu, String model, Integer ram, Integer year, String operatingSystem, Integer weight,
            String battery, String screenSize) {
        super(cpu, model, ram, year);
    } // need setters */

    public Laptop(String cpu, String model, Integer ram, Integer year, String operatingSystem, Integer weight,
            String battery, String screenSize) {
        super(cpu, model, ram, year);
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.battery = battery;
        this.screenSize = screenSize;
    }
   // constructor overloading, cause many diff types
    

    //generate getters and setters inside class

    public String getoperatingSystem() {
        return operatingSystem;
    }
    public void setoperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public Integer getWeight() {
        return weight;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    public String getBattery() {
        return battery;
    }
    public void setBattery(String battery) {
        this.battery = battery;
    }
    public String getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    
    @Override
    public void startup() {
        System.out.println("Laptop powered up...");
    } 

    @Override
    public void shutdown() {
        System.out.println("Shutting down...");
    }

    
    @Override
    public void displaySpec() {
        System.out.println("This laptop specs: ");
        System.out.println(this.getModel());
        System.out.println(this.getCpu());
        System.out.println(this.getRam());
        System.out.println(this.getYear());
        System.out.println(this.getoperatingSystem());
        System.out.println(this.getBattery());
        System.out.println(this.getScreenSize());
        System.out.println(this.getWeight());
        }

        //Overloading methods
        public Integer computeArithmatic(){ //expect integer return

            Integer a = 1;
            Integer b = 2;
            Integer sum;

            sum = a + b;
            return sum;
        }

        public Integer computeArithmatic(Integer a, Integer b){ //expect integer return

            Integer sum;

            sum = a + b;
            return sum;
        }

}
