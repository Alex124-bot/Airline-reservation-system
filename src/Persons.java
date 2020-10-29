import java.util.Scanner;

public class Persons extends Destinations {

    boolean running = true;

    public Persons(String country, int originalPrice, double travelAllowance, int travelLength) {
        super(country, originalPrice, travelAllowance, travelLength);
    }

    public void showPersons() {

        for (int i = 0; i < per; i++) {
            System.out.println("Please enter the name of passenger number: " + i + 1);
        }

        while (running) {



            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine();

            if (cmd == "0") {
                System.out.println("Going back!");
                running = false;
            }
        }
    }
}


