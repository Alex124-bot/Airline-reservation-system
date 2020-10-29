import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    String country;
    int originalPrice;
    double travelAllowance;
    int travelLength;

    public Menu() {

    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setOriginalPrice(int originalPrice) {
        this.originalPrice = originalPrice;
    }

    public void setTravelAllowance(double travelAllowance) {
        this.travelAllowance = travelAllowance;
    }

    public void setTravelLength(int travelLength) {
        this.travelLength = travelLength;
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

    public Menu(String country, int originalPrice, double travelAllowance, int travelLength) {
        this.country = country;
        this.originalPrice = originalPrice;
        this.travelAllowance = travelAllowance;
        this.travelLength = travelLength;
    }

    void showMenu() {

        ArrayList<Destinations> destinations = new ArrayList<>();
        ArrayList<Destinations> reservations = new ArrayList<>();

            Scanner sc = new Scanner(System.in);

            boolean running = true;

            while (running) {
                System.out.println("MENU:");
                System.out.println("1: Jutland (A)");
                System.out.println("2: Sweden (A)");
                System.out.println("3: Spain (B)");
                System.out.println("4: Austia (B)");
                System.out.println("5: Holland (B)");
                System.out.println("6: China (A)");
                System.out.println("0: Quit");

                String cmd = sc.nextLine();
                StringBuilder sb = new StringBuilder();
                int i = 0;


                if (cmd.equals("1")) {
                    Destinations one = new Destinations("Jutland", 451, 1.04, 450);
                    one.destination();
                }

                if (cmd.equals("2")) {
                    Destinations one = new Destinations("Sweden", 267, 1.04, 243);
                    one.destination();
                }

                if (cmd.equals("3")) {
                    Destinations one = new Destinations("Spain", 692, 1.0002, 1392);
                    one.destination();
                }

                if (cmd.equals("4")) {
                    Destinations one = new Destinations("Austria", 1034, 1.0002, 1791);
                    one.destination();
                }

                if (cmd.equals("5")) {
                    Destinations one = new Destinations("Holland", 354, 1.0002, 679);
                    one.destination();
                }

                if (cmd.equals("6")) {
                    Destinations one = new Destinations("China", 399, 1.04, 8421);
                    one.destination();
                }

                if (cmd.equals("0")) {
                    System.out.println("Quitting");
                    running = false;
                }
            }
        }
    }
