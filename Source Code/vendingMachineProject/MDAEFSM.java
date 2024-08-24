package vendingMachineProject;

public class MDAEFSM {
    private OP op;
    private int k;
    private int[] A;

    // State variables
    private State startState;
    private State noCupsState;
    private State idleState;
    private State coinInsertedState;
    // Current state variable
    private State currentState;
    private boolean cardSwiped;
    public MDAEFSM(OP op) {
        this.op = op;
        this.A = new int[2];
        
        // Initialize state instances
        startState = new Start(this,op);
        noCupsState = new NoCups(this,op);
        idleState = new Idle(this,op);
        coinInsertedState = new CoinInserted(this,op);

        // Set the initial state
        currentState = startState;
    }

    // State getter methods
    public State getStartState() {
        return startState;
    }

    public State getNoCupsState() {
        return noCupsState;
    }

    public State getIdleState() {
        return idleState;
    }

    public State getCoinInsertedState() {
        return coinInsertedState;
    }
    
    public OP getOp() {
        return op;
    }
    
    public int getK() {
    	return k;
    }
    
    public int[] getA() {
		return A;
	}
    
    public boolean getCardSwiped() {
    	return cardSwiped;
    }
    
    public State getState() {
    	return currentState;
    }

    // Method to change the current state
    public void setState(State state) {
        this.currentState = state;
        System.out.println("State set to: " + state.getClass().getSimpleName());
    }
    
    public void setK(int k) {
        this.k = k;
    }

    public void setA(int[] a) {
		A = a;
	}
    
    public void setCardSwiped(boolean cardSwiped) {
    	this.cardSwiped = cardSwiped;
    }

    public void create() {
        currentState.create();
    }

    public void insertCups(int n) {
        currentState.insertCups(n);
    }

    public void coin(float f) {
        currentState.coin(f);
    }

    public void card() {
        currentState.card();
    }

    public void cancel() {
        currentState.cancel();
    }

    public void setPrice() {
        currentState.setPrice();
    }

    public void disposeDrink(int d) {
        currentState.disposeDrink(d);
    }

    public void additive(int a) {
        currentState.additive(a);
    }

	
}
