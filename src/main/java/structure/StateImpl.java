package structure;

import utils.StateID;
import utils.StateIDImpl;

public class StateImpl implements State {

    private String valueState;
    private String id;
    StateID stateID;

    public StateImpl(String valueState) {
        stateID = StateIDImpl.getInstance();
        this.valueState = valueState;
        this.id = stateID.createStateID();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getValueState() {
        return valueState;
    }

    @Override
    public void reset(){
        stateID.reset();
    }
}
