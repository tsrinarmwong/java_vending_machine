package vendingMachineProject;

public class ZeroCF_2 extends ZeroCF {
    @Override
    public void zeroCF(DataStore dataStore) {
    	DataStore2 ds2 = (DataStore2) dataStore;
        ds2.setCf(0);
        System.out.println("CF amount: " + ds2.getCf());
    }
}
