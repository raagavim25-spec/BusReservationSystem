import java.util.Scanner;
public class Main{
    static String passengerName;
    static int seatNo;
    static boolean booked = false;
    public static void viewBus() {
        System.out.println("Bus Name : Tamil Express");
        System.out.println("Route : Chennai to Madurai");
        System.out.println("Available Seats : 40");
    }
    public static void bookTicket() {
        Scanner sc = new Scanner(System.in);
        if (booked) {
            System.out.println("Seat already booked");
        } else {
            System.out.print("Enter passenger name: ");
            passengerName = sc.nextLine();
            System.out.print("Enter seat number: ");
            seatNo = sc.nextInt();
            booked = true;
            System.out.println("Ticket booked successfully");
        }
    }
    public static void cancelTicket() {
        if (booked) {
            booked = false;
            System.out.println("Ticket cancelled");
        } else {
            System.out.println("No booking found");
        }
    }
    public static void viewBooking() {
        if (booked) {
            System.out.println("Passenger Name : " + passengerName);
            System.out.println("Seat Number : " + seatNo);
        } else {
            System.out.println("No booking available");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1.View Bus");
            System.out.println("2.Book Ticket");
            System.out.println("3.Cancel Ticket");
            System.out.println("4.View Booking");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    viewBus();
                    break;
                case 2:
                    bookTicket();
                    break;
                case 3:
                    cancelTicket();
                    break;
                case 4:
                    viewBooking();
                    break;
                case 5:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 5);
    }
}