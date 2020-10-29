import java.util.Scanner;

public class Destinations extends Menu {

    boolean running = true;
    int persons;
    String country;
    int originalPrice;
    double travelAllowance;

    public boolean isRunning() {
        return running;
    }

    public int getPersons() {
        return persons;
    }

    public String getCountry() {
        return country;
    }

    public int getOriginalPrice() {
        return originalPrice;
    }

    public double getTravelAllowance() {
        return travelAllowance;
    }

    public int getTravelLength() {
        return travelLength;
    }

    public double getTotalCost() {
        return totalCost;
    }

    int travelLength;
    double totalCost;

    public Destinations(String country, int originalPrice, double travelAllowance, int travelLength) {
        this.country = country;
        this.originalPrice = originalPrice;
        this.travelAllowance = travelAllowance;
        this.travelLength = travelLength;
    }

    public void destination() {

        System.out.println("You have chosen " + country + "," + " the prices are");
        System.out.println("The original price + travelAllowance is " + originalPrice + " * " + travelAllowance + " which amounts to " + originalPrice * travelAllowance + " pr. person");
        System.out.println("");
        System.out.println("MENU:");
        System.out.println("How many persons are/is travelling!");
        System.out.println("*: Next");
        System.out.println("0: Back!");

        while (running) {
            Scanner sc = new Scanner(System.in);
            int cmd = sc.nextInt();

            if (cmd > 0) {
                persons = cmd;
            }
                else if (cmd == 0) {
                System.out.println("Going back!");
                running = false;
            }
        }
    }
}
