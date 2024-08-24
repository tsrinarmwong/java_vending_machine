package vendingMachineProject;

public class CF1 extends AbstractFactory {
	
    @Override
    public DataStore createDataStore() {
        return new DataStore1();
    }

    @Override
    public StorePrice createStorePrice() {
        return new StorePrice_1();
    }

    @Override
    public ZeroCF createZeroCF() {
        return new ZeroCF_1();
    }

    @Override
    public IncreaseCF createIncreaseCF() {
        return new IncreaseCF_1();
    }

    @Override
    public ReturnCoins createReturnCoins() {
        return new ReturnCoins_1();
    }

    @Override
    public DisposeDrink createDisposeDrink() {
        return new DisposeDrink_1();
    }

    @Override
    public DisposeAdditive createDisposeAdditive() {
        return new DisposeAdditive_1();
    }
}