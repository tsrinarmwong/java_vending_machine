package vendingMachineProject;

public class NoCups extends State {
    public NoCups(MDAEFSM mdaEFSM, OP op) {
        super(mdaEFSM, op);
    }

    @Override
    public void create() {
        System.out.println("Cannot create in this state.");
    }

    @Override
    public void insertCups(int n) {
        mdaEFSM.setK(n); // set number of available cups to n
        System.out.println("Cups: " + mdaEFSM.getK());
        op.zeroCF();
        mdaEFSM.setState(mdaEFSM.getIdleState());
    }

    @Override
    public void coin(float f) {
        System.out.println("Still No Cups...");
        op.returnCoins();
    }

    @Override
    public void card() {
        System.out.println("Cannot card in this state.");
    }

    @Override
    public void cancel() {
        System.out.println("Cannot cancel in this state.");
    }

    @Override
    public void setPrice() {
        System.out.println("Cannot set price in this state.");
    }

    @Override
    public void disposeDrink(int d) {
        System.out.println("Cannot dispose drink in this state.");
    }

    @Override
    public void additive(int a) {
        System.out.println("Cannot additive in this state.");
    }
}
