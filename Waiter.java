public class Waiter extends RestaurantStaff {
    public void handle(String complaint, int severity) {
        if (severity == 1)
            System.out.println("Handled by Waiter: complaint = '" + complaint + "', severity = " + severity + ".");
        else
            forward(complaint, severity);
    }
}