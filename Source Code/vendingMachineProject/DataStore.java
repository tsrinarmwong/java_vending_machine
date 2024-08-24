package vendingMachineProject;

public abstract class DataStore {
    private int d;
    private int[] A;

    public int getDrink() {
        return d;
    }

    public void setDrink(int drink) {
        this.d = drink;
    }

    public int[] getAdditives() {
        return A;
    }

    public void setAdditives(int[] additives) {
        this.A = additives;
    }
}
