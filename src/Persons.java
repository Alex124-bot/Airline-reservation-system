import java.util.Scanner;

public class Persons extends Destinations {

    String name;
    int persons;
    boolean running = true;

    public Persons(String country, int originalPrice, double travelAllowance, int travelLength, int persons) {
        super(country, originalPrice, travelAllowance, travelLength);
    }

    public Persons() {
        super();
    }

    public void showPersons() {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        while (running) {
            System.out.println("Please enter the name of " + persons + "passengers");

            if (name == "0") {
                System.out.println("Going back!");
                running = false;
            }
        }
    }
}


