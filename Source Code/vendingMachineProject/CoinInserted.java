package vendingMachineProject;

public class CoinInserted extends State {
	public CoinInserted(MDAEFSM mdaEFSM, OP op) {
		super(mdaEFSM, op);
	}

	@Override
	public void coin(float f) {
		if (mdaEFSM.getCardSwiped() == false) { // If you use card you can't get coin back
			DataStore dataStore = op.getDataStore();
			float cf;
			float price;

			if (dataStore instanceof DataStore1) {
				DataStore1 ds1 = (DataStore1) dataStore;
				cf = ds1.getCf() + f;
				price = ds1.getPrice();
				ds1.setCf(cf);
			} else {
				DataStore2 ds2 = (DataStore2) dataStore;
				cf = ds2.getCf() + f;
				price = ds2.getPrice();
				ds2.setCf((int) cf);
			}

			float change = cf - price;
			System.out.println("Returning change: " + change);
		}
	}

	@Override
	public void cancel() {
		if (mdaEFSM.getCardSwiped() == false) { // If you use card you can't get coin back
			op.returnCoins();
		} else {
			System.out.println("Card used, no coins returning...");
			}
		op.zeroCF();
		mdaEFSM.setState(mdaEFSM.getIdleState());
	}

	@Override
	public void disposeDrink(int d) {
		if (mdaEFSM.getK() > 1) {
			op.disposeAdditive(mdaEFSM.getA());
			op.disposeDrink(d);
			mdaEFSM.setK(mdaEFSM.getK() - 1);
			coin(0);
			op.zeroCF();
			System.out.println("Cups: " + mdaEFSM.getK());
			mdaEFSM.setState(mdaEFSM.getIdleState());
		} else {
			op.disposeAdditive(mdaEFSM.getA());
			op.disposeDrink(d);
			mdaEFSM.setK(mdaEFSM.getK() - 1);
			coin(0);
			op.zeroCF();
			System.out.println("Cups: " + mdaEFSM.getK());
			mdaEFSM.setState(mdaEFSM.getNoCupsState());
		}
	}

	@Override
	public void additive(int a) {
		DataStore dataStore = mdaEFSM.getOp().getDataStore();

		if (dataStore instanceof DataStore1) { // VM_1: Only sugar (0) is allowed
			if (a == 0) {
				if (mdaEFSM.getA()[0] == 1) {
					mdaEFSM.getA()[0] = 0;
					System.out.println("Sugar De-selected");
				} else {
					mdaEFSM.getA()[0] = 1;
					System.out.println("Sugar selected");
				}
			}
		} else if (dataStore instanceof DataStore2) { // VM_2: Both sugar (0) and cream (1) are allowed
			if (a == 0) {
				if (mdaEFSM.getA()[0] == 1) {
					mdaEFSM.getA()[0] = 0;
					System.out.println("Sugar De-selected");
				} else {
					mdaEFSM.getA()[0] = 1;
					System.out.println("Sugar selected");
				}
			} else if (a == 1) {
				if (mdaEFSM.getA()[1] == 1) {
					mdaEFSM.getA()[1] = 0;
					System.out.println("Cream De-selected");
				} else {
					mdaEFSM.getA()[1] = 1;
					System.out.println("Cream selected");
				}
			}
		}
	}

	@Override
	public void create() {
		System.out.println("Cannot create in this state.");
	}

	@Override
	public void insertCups(int n) {
		System.out.println("Cannot insert cups in this state.");
	}

	@Override
	public void card() {
		System.out.println("Cannot read card in this state.");
	}

	@Override
	public void setPrice() {
		System.out.println("Cannot set price in this state.");
	}
}
