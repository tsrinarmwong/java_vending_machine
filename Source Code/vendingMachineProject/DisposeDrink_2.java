package vendingMachineProject;

public class DisposeDrink_2 extends DisposeDrink {
	@Override
	public void disposeDrink(DataStore dataStore) {
		int d = dataStore.getDrink();
		String drink = "";
		switch (d) {
		case 1:
			drink = "tea";
			break;
		case 2:
			drink = "latte";
			break;
		case 3:
			drink = "coffee";
			break;
		default:
			throw new IllegalArgumentException("Invalid drink id.");
		}
		System.out.println("Dispensing " + drink + "...");
	}
}