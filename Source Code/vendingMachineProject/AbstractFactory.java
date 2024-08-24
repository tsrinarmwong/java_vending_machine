package vendingMachineProject;

public abstract class AbstractFactory {
    public abstract DataStore createDataStore();
    public abstract StorePrice createStorePrice();
    public abstract ZeroCF createZeroCF();
    public abstract IncreaseCF createIncreaseCF();
    public abstract ReturnCoins createReturnCoins();
    public abstract DisposeDrink createDisposeDrink();
    public abstract DisposeAdditive createDisposeAdditive();
}
