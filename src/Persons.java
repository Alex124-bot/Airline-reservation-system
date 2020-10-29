import java.util.Scanner;

public class Persons extends Destinations {

    String name;
    int persons;
    boolean running = true;

    public Persons(String country, int originalPrice, double travelAllowance, int travelLength, int persons) {
        super(country, originalPrice, travelAllowance, travelLength);
        this.persons = persons;
        this.name = name;
    }

    public Persons() {
        super();
    }

    public void showPersons() {

        while (running) {
            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine();
            System.out.println("Please enter the name of passenger number: " persons);

            if (cmd == "0") {
                System.out.println("Going back!");
                running = false;
            }
        }
    }
}


