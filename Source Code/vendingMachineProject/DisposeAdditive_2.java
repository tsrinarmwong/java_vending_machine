package vendingMachineProject;


public class DisposeAdditive_2 extends DisposeAdditive {
    @Override
    public void disposeAdditive(DataStore dataStore) {
        int[] A = ((DataStore2) dataStore).getAdditives();
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                String additive = "";
                switch (i) {
                    case 0:
                        additive = "sugar";
                        break;
                    case 1:
                        additive = "cream";
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid additive id.");
                }
                System.out.println("Dispensing " + additive + "...");
            }
        }
    }
}