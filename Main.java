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
        waiter.handle("Food order was served late and cold.", 2);

        System.out.println("Complaint 3:");
        waiter.handle("A kitchen issue caused a burnt dish.", 3);

        System.out.println("Complaint 4:");
        waiter.handle("Billing dispute on the invoice.", 4);

        System.out.println("Complaint 5:");
        waiter.handle("A serious customer safety concern was reported.", 5);
    }
}