import java.util.Scanner;

public class Persons extends Destinations {

    public Persons(String country, int originalPrice, double travelAllowance, int travelLength) {
        super(country, originalPrice, travelAllowance, travelLength);
    }

    void showPersons() {

        boolean running = true;

            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine();

            while (running) {
                for (int i = 0; i < per; i++)
                    System.out.println("Please enter the name of passenger number: " + i + 1);

            }
            if (cmd == "0") {
                System.out.println("Going back!");
                running = false;
            }
        }
    }
}


