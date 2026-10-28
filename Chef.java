public class Chef extends RestaurantStaff {
    public void handle(String complaint, int severity) {
        if (severity == 2)
            System.out.println("Handled by Chef: complaint = '" + complaint + "', severity = " + severity + ".");
        else
            forward(complaint, severity);
    }
}