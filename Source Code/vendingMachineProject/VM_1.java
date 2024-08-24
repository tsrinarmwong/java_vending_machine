package vendingMachineProject;

public class VM_1 {
	private MDAEFSM mdaEFSM;
	private AbstractFactory factory;
	private DataStore1 d; 

	public VM_1() {
		factory = new CF1();
		d = (DataStore1) factory.createDataStore(); 
		OP op = new OP(factory, d);
		mdaEFSM = new MDAEFSM(op);
	}

	public void create(int p) {
		d.setTempP(p);
		mdaEFSM.create();
	}

	public void coin(float v) {
		d.setTempV(v);
		if(d.getCf()+v >= d.getPrice()) {
			mdaEFSM.coin(1); //sufficient funds
		} else {
			System.out.println("Price: " + d.getPrice());
			mdaEFSM.coin(0); //insufficient funds
		}
	}

	public void sugar() {
		mdaEFSM.additive(0);
	}

	public void tea() {
		mdaEFSM.disposeDrink(1);
	}

	public void latte() {
		mdaEFSM.disposeDrink(2);
	}

	public void insert_cups(int n) {
		mdaEFSM.insertCups(n);
	}

	public void set_price(float p) {
		d.setTempP(p);
		mdaEFSM.setPrice();
	}

	public void cancel() {
		mdaEFSM.cancel();
	}
}
