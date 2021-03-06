package utils;

/**
 * This class manages the state identifier.
 * This is a singleton to a consistent state id in all computing
 */
public class StateIDImpl implements StateID {

    private static StateIDImpl instance = null;
    private int counter = -1;

    public StateIDImpl() {
        reset();
    }

    public static StateID getInstance() {
        if(instance == null)
            instance = new StateIDImpl();
        return instance;
    }

    @Override
    public String createStateID(){
        counter++;
        return "s"+ counter;
    }

    @Override
    public void reset(){
        counter = -1;
        instance = null;
    }
}
