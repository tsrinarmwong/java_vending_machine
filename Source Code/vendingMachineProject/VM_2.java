package vendingMachineProject;

public class VM_2 {
	private MDAEFSM mdaEFSM;
	private AbstractFactory factory;
	private DataStore2 d;

	public VM_2() {
		factory = new CF2();
		d = (DataStore2) factory.createDataStore();
		OP op = new OP(factory, d);
		mdaEFSM = new MDAEFSM(op);
	}

	public void CREATE(float p) {
		d.setTempP(p);
		mdaEFSM.create();
	}

	public void COIN(int v) {
		d.setTempV(v);
		if(d.getCf()+v >= d.getPrice()) {
			mdaEFSM.coin(1); //sufficient funds
		} else {
			System.out.println("Price: " + d.getPrice());
			mdaEFSM.coin(0); //insufficient funds
		}
	}

	public void CARD(int x) {
		if (x >= d.getPrice()) { //sufficient funds
			mdaEFSM.card();
		} else if (x < d.getPrice()) { //sufficient funds
			System.out.println("Insufficient funds");
			System.out.println("Price: " + d.getPrice());
		} else if (!(mdaEFSM.getState() instanceof Idle)){
			mdaEFSM.card(); //it will invalid state
		}
	}

	public void SUGAR() {
		mdaEFSM.additive(0);
	}

	public void CREAM() {
		mdaEFSM.additive(1);
	}

	public void COFFEE() {
		mdaEFSM.disposeDrink(3);
	}

	public void InsertCups(int n) {
		mdaEFSM.insertCups(n);
	}

	public void SetPrice(int p) {
		d.setTempP(p);
		mdaEFSM.setPrice();
	}

	public void CANCEL() {
		mdaEFSM.cancel();
	}
}
