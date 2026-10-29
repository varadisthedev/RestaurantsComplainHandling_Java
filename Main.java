import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Connect handlers in order.
        Handler waiter = new Waiter();
        Handler chef = new Chef();
        Handler headChef = new HeadChef();
        Handler manager = new Manager();
        Handler owner = new Owner();

        waiter.setNext(chef);
        chef.setNext(headChef);
        headChef.setNext(manager);
        manager.setNext(owner);
        
        
        // Customer sends complaints to the first handler.
        System.out.println("Complaint 1:");
        waiter.handle("Cold chai served during breakfast.", 1);
        
        System.out.println("Complaint 2:");
        waiter.handle("Too much salt and red chilli spice added", 2);
        
        System.out.println("Complaint 3:");
        waiter.handle("Cockroach found in the food", 3);
        
        System.out.println("Complaint 4:");
        waiter.handle("Dispute happened due to missing payment of a customer", 4);
        
        
        System.out.println("Complaint 5:");
        waiter.handle("25% gst charged instaed of 5%", 5);
        
        System.out.println("Complaint 6:");
        waiter.handle("FDA Commissioner: Tukaram Munde visited the restraunt for inspection", 5);

        // negative severity
        System.out.println("Complaint 7:");
        waiter.handle("Negative severity test", -1);

        System.out.println("Enter your own complaint:");
        System.out.println("Complaint 8:");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter your complaint:");
            String complaint = scanner.nextLine();

            System.out.print("Enter severity (0 for tip, 1-5 for complaints):");
            int severity = scanner.nextInt();

            waiter.handle(complaint, severity);
        }   
        catch(Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}