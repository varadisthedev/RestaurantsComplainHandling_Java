public class Waiter extends RestaurantStaff {
    public void handle(String complaint, int severity) {

        if (severity == 1)
            System.out.println("Handled by Waiter: complaint = '" + complaint + "', severity = " + severity + ".");
        else if(severity==0){
            System.err.println("thank you for your Tip! Visit us again. "+ "Tip = '" + complaint +"'");
        }
        else if(severity<0){
            System.out.println("Severity cannnot have negative score!");
        }
        else
            forward(complaint, severity);
    }
}