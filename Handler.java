// Common contract for all complaint handlers.
public interface Handler {
    void setNext(Handler next);

    void handle(String complaint, int severity);
}