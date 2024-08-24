package vendingMachineProject;

public class IncreaseCF_2 extends IncreaseCF {
    @Override
    public void increaseCF(DataStore dataStore) {
    	DataStore2 ds2 = (DataStore2) dataStore;
    	ds2.setCf((int)ds2.getCf() + ds2.getTempV());
		System.out.println("CF amount: " + ds2.getCf());	
    }
}