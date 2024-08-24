package vendingMachineProject;


public class StorePrice_2 extends StorePrice {
    @Override
    public void storePrice(DataStore dataStore) {
        DataStore2 ds2 = (DataStore2) dataStore;
        ds2.setPrice(ds2.getTempP());
        System.out.println("Price: " + ds2.getPrice());
    }
}
