package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class Monster implements CurrentState {

    CurrentState currentState;

    public Monster(CurrentState currentState)
    {
        this.currentState = currentState;
    }

    public void setCurrentState(CurrentState currentState){
        this.currentState = currentState;
    }

    @Override
    public String greet() {
        return currentState.greet();
    }

    @Override
    public String leave() {
        return currentState.leave();
    }
}
