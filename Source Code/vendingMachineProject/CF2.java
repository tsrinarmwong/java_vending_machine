package vendingMachineProject;

public class CF2 extends AbstractFactory {
    @Override
    public DataStore createDataStore() {
        return new DataStore2();
    }

    @Override
    public StorePrice createStorePrice() {
        return new StorePrice_2();
    }

    @Override
    public ZeroCF createZeroCF() {
        return new ZeroCF_2();
    }

    @Override
    public IncreaseCF createIncreaseCF() {
        return new IncreaseCF_2();
    }

    @Override
    public ReturnCoins createReturnCoins() {
        return new ReturnCoins_2();
    }

    @Override
    public DisposeDrink createDisposeDrink() {
        return new DisposeDrink_2();
    }

    @Override
    public DisposeAdditive createDisposeAdditive() {
        return new DisposeAdditive_2();
    }
}