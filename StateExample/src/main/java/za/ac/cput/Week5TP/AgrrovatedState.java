package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class AgrrovatedState implements CurrentState {
    @Override
    public String greet() {
        return "Grrr";
    }

    @Override
    public String leave() {
        return "Run";
    }
}
