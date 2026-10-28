public class Owner extends RestaurantStaff {
    public void handle(String complaint, int severity) {
        System.out.println("Handled by Owner: complaint = '" + complaint + "', severity = " + severity + ". Final escalation.");
    }
}