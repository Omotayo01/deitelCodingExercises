package Di;

public class Girl {

    private Boyfriend boyfriend;

    public Girl (Boyfriend boyfriend){
        this.boyfriend = boyfriend;
    }

    public void spendSomeMoney(int amount){
        boyfriend.spend(amount);
    }

    public void setBoyfriend(Boyfriend prof) {

        boyfriend = prof;
    }
}

