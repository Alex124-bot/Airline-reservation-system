import java.util.Scanner;

public class Destinations extends Menu {

    boolean running = true;
    int persons;
    String country;
    int originalPrice;
    double travelAllowance;

    public void setPersons(int persons) {
        this.persons = persons;
    }

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
        System.out.println("The original price + travelAllowance is " + originalPrice + " * " + travelAllowance + " which amounts to " + originalPrice * travelAllowance + " pr. person not considering business or economy!");
        System.out.println("The travellength is " + travelLength);
        System.out.println("");
        System.out.println("MENU:");
        System.out.println("How many persons are/is travelling!");
        System.out.println("*: Next");
        System.out.println("0: Back!");


        while (running) {
            Scanner sc = new Scanner(System.in);
            int cmd = sc.nextInt();
            if (cmd > 0) {
                setPersons(sc);
                totalCost = persons * (originalPrice * travelAllowance);
                System.out.println("You have chosen " + persons + " persons");
                System.out.println("");
                System.out.println("So far your total cost is " + persons + " persons * " + originalPrice * travelAllowance + " kr = " + totalCost + " kr");

            } else if (cmd == "0") {
                System.out.println("Going back!");
                running = false;
            }
        }
    }
}
