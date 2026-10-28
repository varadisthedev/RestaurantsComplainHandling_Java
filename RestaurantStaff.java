// Shared functionality for all restaurant staff.
public abstract class RestaurantStaff implements Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    protected void forward(String complaint, int severity) {
        if (next != null)
            next.handle(complaint, severity);
        else
            System.out.println("Complaint unresolved: '" + complaint + "' with severity " + severity + ".");
    }
}