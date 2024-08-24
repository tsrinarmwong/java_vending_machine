package vendingMachineProject;

public abstract class State {
    protected MDAEFSM mdaEFSM;
    protected OP op;

    public State(MDAEFSM mdaEFSM, OP op) {
        this.mdaEFSM = mdaEFSM;
        this.op = op;
    }

    // Abstract methods
    public abstract void create();
    public abstract void insertCups(int n);
    public abstract void coin(float f);
    public abstract void card();
    public abstract void cancel();
    public abstract void setPrice();
    public abstract void disposeDrink(int d);
    public abstract void additive(int a);
}
