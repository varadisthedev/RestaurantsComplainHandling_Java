public class HeadChef extends RestaurantStaff {
    public void handle(String complaint, int severity) {
        if (severity == 3)
            System.out.println("Handled by Head Chef: complaint = '" + complaint + "', severity = " + severity + ".");
        else
            forward(complaint, severity);
    }
}