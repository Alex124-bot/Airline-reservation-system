import java.util.Scanner;

public class Menu  {

    public static void main(String[] args) {
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

            if (cmd.equals("1")) {
                Destinations one = new Destinations("Jutland", 0, 451, 1.04, 450);
                one.destination();
            }

            if (cmd.equals("2")) {
                Destinations one = new Destinations("Sweden", 0, 267, 1.04, 243);
                one.destination();
            }

            if (cmd.equals("3")) {
                Destinations one = new Destinations("Spain", 0, 692, 1.0002, 1392);
                one.destination();
            }

            if (cmd.equals("4")) {
                Destinations one = new Destinations("Austria", 0, 1034, 1.0002, 1791);
                one.destination();
            }

            if (cmd.equals("5")) {
                Destinations one = new Destinations("Holland", 0, 354, 1.0002, 679);
                one.destination();
            }

            if (cmd.equals("6")) {
                Destinations one = new Destinations("China", 0, 399, 1.04, 8421);
                one.destination();
            }

            if (cmd.equals("0")) {
                System.out.println("Quitting");
                running = false;
            }
        }
    }
}
