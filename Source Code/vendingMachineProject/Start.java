package vendingMachineProject;
public class Start extends State {
    public Start(MDAEFSM mdaEFSM,OP op) {
        super(mdaEFSM,op);
    }

    @Override
    public void create() {
        op.storePrice();
        op.zeroCF();
        mdaEFSM.setState(mdaEFSM.getNoCupsState());
    }

    @Override
    public void insertCups(int n) {
        System.out.println("Cannot insert cups before create.");
    }

    @Override
    public void coin(float f) {
        System.out.println("Cannot insert coin before create.");
    }

    @Override
    public void card() {
        System.out.println("Cannot use card before create.");
    }

    @Override
    public void cancel() {
        System.out.println("Cannot cancel before create.");
    }

    @Override
    public void setPrice() {
        System.out.println("Cannot set price before create.");
    }

    @Override
    public void disposeDrink(int d) {
        System.out.println("Cannot dispose drink before create.");
    }

    @Override
    public void additive(int a) {
        System.out.println("Cannot add additive before create.");
    }
}
