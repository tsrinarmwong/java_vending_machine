package vendingMachineProject;

public class OP {
    private DataStore dataStore;
    private AbstractFactory abstractFactory;

    public OP(AbstractFactory abstractFactory, DataStore dataStore) {
        this.abstractFactory = abstractFactory;
        this.dataStore = dataStore;
    }

    public void storePrice() {
        StorePrice storePrice = abstractFactory.createStorePrice();
        storePrice.storePrice(dataStore);
    }

    public void zeroCF() {
        ZeroCF zeroCF = abstractFactory.createZeroCF();
        zeroCF.zeroCF(dataStore);
    }

    public void increaseCF() {
        IncreaseCF increaseCF = abstractFactory.createIncreaseCF();
        increaseCF.increaseCF(dataStore);
    }

    public void returnCoins() {
        System.out.println("Returning coins...");
    }

    public void disposeDrink(int d) {
        dataStore.setDrink(d);
        DisposeDrink disposeDrink = abstractFactory.createDisposeDrink();
        disposeDrink.disposeDrink(dataStore);
    }

    public void disposeAdditive(int[] a) {
        dataStore.setAdditives(a);
        DisposeAdditive disposeAdditive = abstractFactory.createDisposeAdditive();
        disposeAdditive.disposeAdditive(dataStore);
    }

    public void cancel() {
        ReturnCoins returnCoins = abstractFactory.createReturnCoins();
        returnCoins.returnCoins(dataStore);
        ZeroCF zeroCF = abstractFactory.createZeroCF();
        zeroCF.zeroCF(dataStore);
    }
    
    public DataStore getDataStore() {
        return dataStore;
    }
}
