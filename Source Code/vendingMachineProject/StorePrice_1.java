package vendingMachineProject;


public class StorePrice_1 extends StorePrice {
    @Override
    public void storePrice(DataStore dataStore) {
        DataStore1 ds1 = (DataStore1) dataStore;
        ds1.setPrice(ds1.getTempP());
        System.out.println("Price: " + ds1.getPrice());
    }
}
