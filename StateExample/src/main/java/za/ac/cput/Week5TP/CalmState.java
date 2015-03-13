package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class CalmState implements CurrentState {
    @Override
    public String greet() {
        return "Hello";
    }

    @Override
    public String leave() {
        return "Bye";
    }
}
