package ca.fiercest.cuesdk;

public class NoServerException extends Exception {
    NoServerException()
    {
        super("Corsair Service is Not Running, cannot connect.");
    }
}
