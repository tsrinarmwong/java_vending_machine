package vendingMachineProject;

public class Idle extends State {
	public Idle(MDAEFSM mdaEFSM, OP op) {
		super(mdaEFSM, op);
	}

	@Override
	public void insertCups(int n) {
		if (n > 0) {
			mdaEFSM.setK(mdaEFSM.getK() + n);
			System.out.println("Cups: " + mdaEFSM.getK());
		} else {
			System.out.println("Invalid number of cups.");
		}
	}

	@Override
	public void setPrice() {
		op.storePrice();
	}

	@Override
	public void coin(float f) {
		if (f == 1) { // Update the state of the machine
			mdaEFSM.setA(new int[2]);
			mdaEFSM.setState(mdaEFSM.getCoinInsertedState());
		} else { // Accept coin and increase CF
			op.increaseCF();
		}

	}

	@Override
	public void card() {
		op.zeroCF();
		mdaEFSM.setA(new int[2]);
		mdaEFSM.setCardSwiped(true);
		mdaEFSM.setState(mdaEFSM.getCoinInsertedState());
	}

	@Override
	public void create() {
		System.out.println("Cannot create in this state.");
	}

	@Override
	public void cancel() {
		System.out.println("Cannot cancel in this state.");
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
