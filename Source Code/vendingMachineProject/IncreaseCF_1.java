package vendingMachineProject;

public class IncreaseCF_1 extends IncreaseCF {
    @Override
    public void increaseCF(DataStore dataStore) {
    	DataStore1 ds1 = (DataStore1) dataStore;
    	ds1.setCf(ds1.getCf() + ds1.getTempV());
		System.out.println("CF amount: " + ds1.getCf());	
    }
}