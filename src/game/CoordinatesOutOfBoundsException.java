package game;

public class CoordinatesOutOfBoundsException extends Exception{
    public CoordinatesOutOfBoundsException(String errorMessage) {
        super(errorMessage);
    }
}
