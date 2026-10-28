public class Manager extends RestaurantStaff {
    public void handle(String complaint, int severity) {
        if (severity == 4)
            System.out.println("Handled by Manager: complaint = '" + complaint + "', severity = " + severity + ".");
        else
            forward(complaint, severity);
    }
}