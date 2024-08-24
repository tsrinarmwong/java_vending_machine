package vendingMachineProject;

public class DataStore1 extends DataStore {
    private float cf;
    private float price;
    private float tempP;
    private float tempV;

    public float getCf() {
        return cf;
    }

    public void setCf(float cf) {
        this.cf = cf;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTempP() {
        return tempP;
    }

    public void setTempP(float tempP) {
        this.tempP = tempP;
    }

    public float getTempV() {
        return tempV;
    }

    public void setTempV(float tempV) {
        this.tempV = tempV;
    }
}
