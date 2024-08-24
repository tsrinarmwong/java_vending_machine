package vendingMachineProject;

public class ZeroCF_1 extends ZeroCF {
    @Override
    public void zeroCF(DataStore dataStore) {
    	DataStore1 ds1 = (DataStore1) dataStore;
        ds1.setCf(0);
        System.out.println("CF amount: " + ds1.getCf());
    }
}