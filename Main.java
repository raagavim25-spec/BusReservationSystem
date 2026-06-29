import java.util.Scanner;

public class Main {

    static String passengerName;
    static String phoneNo;
    static String travelDate;
    static String busRoute;
    static String busType;

    static int seatNo;
    static int ticketPrice;
    static int ticketId = 1001;

    static boolean booked = false;

    public static void viewBus() {

        System.out.println("\n========== AVAILABLE BUSES ==========");
        System.out.println("1. Tamil Express");
        System.out.println("   Route : Chennai to Madurai");
        System.out.println("   Type  : AC");
        System.out.println("   Fare  : ₹650");

        System.out.println("\n2. Green Travels");
        System.out.println("   Route : Chennai to Coimbatore");
        System.out.println("   Type  : Sleeper");
        System.out.println("   Fare  : ₹700");

        System.out.println("\n3. Royal Express");
        System.out.println("   Route : Madurai to Trichy");
        System.out.println("   Type  : Non-AC");
        System.out.println("   Fare  : ₹350");

        System.out.println("\n4. Super Deluxe");
        System.out.println("   Route : Salem to Chennai");
        System.out.println("   Type  : AC Sleeper");
        System.out.println("   Fare  : ₹500");

        System.out.println("\n5. City Express");
        System.out.println("   Route : Coimbatore to Erode");
        System.out.println("   Type  : Seater");
        System.out.println("   Fare  : ₹250");
    }

    public static void bookTicket(Scanner sc) {

        if (booked) {
            System.out.println("\nTicket already booked.");
            return;
        }

        viewBus();

        System.out.print("\nSelect Bus (1-5): ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                busRoute = "Chennai to Madurai";
                busType = "AC";
                ticketPrice = 650;
                break;

            case 2:
                busRoute = "Chennai to Coimbatore";
                busType = "Sleeper";
                ticketPrice = 700;
                break;

            case 3:
                busRoute = "Madurai to Trichy";
                busType = "Non-AC";
                ticketPrice = 350;
                break;

            case 4:
                busRoute = "Salem to Chennai";
                busType = "AC Sleeper";
                ticketPrice = 500;
                break;

            case 5:
                busRoute = "Coimbatore to Erode";
                busType = "Seater";
                ticketPrice = 250;
                break;

            default:
                System.out.println("Invalid Bus Selection");
                return;
        }

        System.out.print("Enter Passenger Name : ");
        passengerName = sc.nextLine();

        System.out.print("Enter Phone Number   : ");
        phoneNo = sc.nextLine();

        System.out.print("Enter Travel Date (DD/MM/YYYY): ");
        travelDate = sc.nextLine();

        System.out.print("Enter Seat Number    : ");
        seatNo = sc.nextInt();

        booked = true;

        System.out.println("\nTicket Booked Successfully!");
    }

    public static void viewBooking() {

        if (!booked) {
            System.out.println("\nNo Booking Available.");
            return;
        }

        System.out.println("\n=================================");
        System.out.println("         BUS TICKET");
        System.out.println("=================================");
        System.out.println("Ticket ID       : " + ticketId);
        System.out.println("Passenger Name  : " + passengerName);
        System.out.println("Phone Number    : " + phoneNo);
        System.out.println("Route           : " + busRoute);
        System.out.println("Bus Type        : " + busType);
        System.out.println("Travel Date     : " + travelDate);
        System.out.println("Seat Number     : " + seatNo);
        System.out.println("Ticket Price    : ₹" + ticketPrice);
        System.out.println("Booking Status  : Confirmed");
        System.out.println("=================================");
    }

    public static void cancelTicket() {

        if (!booked) {
            System.out.println("\nNo Booking Found.");
            return;
        }

        booked = false;
        passengerName = "";
        phoneNo = "";
        travelDate = "";
        busRoute = "";
        busType = "";
        seatNo = 0;
        ticketPrice = 0;
        ticketId++;

        System.out.println("\nTicket Cancelled Successfully.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n========== BUS RESERVATION SYSTEM ==========");
            System.out.println("1. View Bus Details");
            System.out.println("2. Book Ticket");
            System.out.println("3. View Booking");
            System.out.println("4. Cancel Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    viewBus();
                    break;

                case 2:
                    bookTicket(sc);
                    break;

                case 3:
                    viewBooking();
                    break;

                case 4:
                    cancelTicket();
                    break;

                case 5:
                    System.out.println("\nThank You for Using Bus Reservation System.");
                    break;

                default:
                    System.out.println("\nInvalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}