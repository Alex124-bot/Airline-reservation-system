import java.util.Scanner;

public class Destinations extends Menu {

    boolean running = true;
    int persons;
    double totalCost;

    public Destinations(String country, int originalPrice, double travelAllowance, int travelLength) {
        super(country, originalPrice, travelAllowance, travelLength);
    }

    public Destinations() {

    }

    public void destination() {

        System.out.println("You have chosen " + country + "," + " the prices are:");
        System.out.println("The original price + travel allowance is " + originalPrice + " * " + travelAllowance + " which amounts to " + originalPrice * travelAllowance + " pr. person");
        System.out.println("The travel length is " + travelLength + " km.");
        System.out.println("");
        System.out.println("MENU:");
        System.out.println("How many persons are/is travelling!");
        System.out.println("*: Next");
        System.out.println("0: Back!");


        Scanner sc = new Scanner(System.in);
        int cmd = sc.nextInt();
            while (running) {
                if (cmd > 0) {
                    persons = cmd;
                    totalCost = persons * (originalPrice * travelAllowance);
                    System.out.println("You have chosen " + persons + " persons");
                    System.out.println("So far your total cost is " + persons + " persons * " + originalPrice * travelAllowance + " kr = " + totalCost + " kr");
                    Persons one = new Persons();
                    one.showPersons();

                } else if (cmd == 0) {
                    System.out.println("Going back!");
                    running = false;
                }
            }

        }
    }
