import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    void showMenu() {

        ArrayList<Destinations> destinations = new ArrayList<>();
        ArrayList<Destinations> reservations = new ArrayList<>();

            Scanner sc = new Scanner(System.in);

            boolean running = true;

            while (running) {
                System.out.println("MENU:");
                System.out.println("1: Jylland (A)");
                System.out.println("2: Sverige (A)");
                System.out.println("3: Spanien (B)");
                System.out.println("4: Østrig (B)");
                System.out.println("5: Holland (B)");
                System.out.println("6: Kina (A)");
                System.out.println("0: Quit");

                String cmd = sc.nextLine();
                StringBuilder sb = new StringBuilder();
                int i = 0;


                if (cmd.equals("1")) {
                    Destinations one = new Destinations("Jutland", 451, 1.04, 450);
                    destinations.add(new Destinations("Jutland", 451, 1.04, 450));
                    one.destination();
                }

                if (cmd.equals("2")) {
                    Destinations one = new Destinations("Sweden", 267, 1.04, 243);
                    destinations.add(new Destinations("Sweden", 267, 1.04, 243));
                }

                if (cmd.equals("3")) {
                    Destinations one = new Destinations("Spain", 692, 1.0002, 1392);
                    destinations.add(new Destinations("Spain", 692, 1.0002, 1392));
                }

                if (cmd.equals("4")) {
                    Destinations one = new Destinations("Austria", 1034, 1.0002, 1791);
                    destinations.add(new Destinations("Austria", 1034, 1.0002, 1791));
                }

                if (cmd.equals("5")) {
                    Destinations one = new Destinations("Holland", 354, 1.0002, 679);
                    destinations.add(new Destinations("Holland", 354, 1.0002, 679));
                }

                if (cmd.equals("6")) {
                    Destinations one = new Destinations("China", 399, 1.04, 8421);
                    destinations.add(new Destinations("China", 399, 1.04, 8421));
                }

                if (cmd.equals("0")) {
                    System.out.println("Quitting");
                    running = false;
                }
            }
        }
    }
