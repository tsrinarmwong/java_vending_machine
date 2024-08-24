package vendingMachineProject;

public class DataStore2 extends DataStore {
    private float tempP;
    private int tempV;
    private float price;
    private int cf;
   
    public float getCf() {
        return cf;
    }

    public void setCf(int cf) {
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

    public int getTempV() {
        return tempV;
    }

    public void setTempV(int tempV) {
        this.tempV = tempV;
    }

}
