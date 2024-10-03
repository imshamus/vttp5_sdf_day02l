
import java.util.ArrayList;
import java.util.List;

import object.Computer;
import object.Desktop;
import object.Laptop;

public class App {
public static void main(String[] args) { // use for main function - function that gives output - normally the running one very short, everything done other class folder - the run button
    
    Computer computer = new Computer(); // need empty constructor
    computer.setCpu("5GHz 8 Core"); // replace defined constructor
    computer.setModel("Asus 8000");
    computer.setRam(32);
    computer.setYear(2019);

    computer.startup();
    computer.displaySpec();
    computer.shutdown();

    Computer computer2 = new Computer();
    computer2.startup();
    computer2.displaySpec();
    computer2.shutdown();

    Laptop laptop1 = new Laptop();//empty constructor
    laptop1.setCpu("10GHz 128 Core");
    laptop1.setModel("Asus 12000");
    laptop1.setRam(64);
    laptop1.setYear(2024);
    
    laptop1.setoperatingSystem("W11 Pro");
    laptop1.setBattery("11.1V 3S LIPO");
    laptop1.setWeight(3);
    laptop1.setScreenSize("15.4 inch OLED");

    laptop1.startup();
    laptop1.displaySpec();
    laptop1.shutdown();

    Desktop desktop1 = new Desktop("4GHz 8 Core", "Alibaba", 16, 2024, "WIN12", 5, true);
    desktop1.startup();
    desktop1.displaySpec();
    desktop1.shutdown();

    List<Computer> machines = new ArrayList<>();
    machines.add(desktop1);
    machines.add(computer);
    machines.add(computer2);
    machines.add(laptop1);

    //for statement to display machines
    //compile
    //run

/*     Integer i = machines.size();
    System.out.println(i); */

    for (int i = 0; i < machines.size(); i++) {
        System.out.println("Machine " + i +" : ");
        machines.get(i).displaySpec();
        System.out.println("\n");
    }

    // compile
        // javac -d target --source-path . ./*.java  object/*.java 

        // run
        // java -cp target App
        
}
    
}
