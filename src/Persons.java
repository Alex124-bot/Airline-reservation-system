import java.util.Scanner;

public class Persons extends Destinations {

    public Persons(String country, int persons, int originalPrice, double travelAllowance, int travelLength) {
        super(country, persons, originalPrice, travelAllowance, travelLength);

    boolean running = true;

    Scanner sc = new Scanner(System.in);

        while (running) {
        totalCost = persons * (originalPrice * travelAllowance);
        System.out.println("You have chosen " + persons + " persons");
        System.out.println("");
        System.out.println("So far your total cost is " + persons + " persons * " + originalPrice * travelAllowance + " kr = "  + totalCost + " kr");

        String cmd = sc.nextLine();

        if (cmd.equals("1")) {
        }

            else if (cmd == "0") {
                System.out.println("Going back!");
                running = false;
            }
        }


    }
}
