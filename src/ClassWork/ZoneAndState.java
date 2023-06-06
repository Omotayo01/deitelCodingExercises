package ClassWork;

public enum ZoneAndState {

    NORTH_CENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nassarawa");
//            "Niger", "Plateau"), NORTH_EAST("Adamawa", ""),
//    NORTH_WEST, SOUTH_EAST("Abia", "Anambra", "Ebonyi",
//            "Enugu", "Imo" ), SOUTH_SOUTH, SOUTH_WEST;


    private String states;

    ZoneAndState(String stateOne, String stateTwo, String stateThree, String stateFour, String stateFive){

        this.states = stateOne;
        this.states = stateTwo;
        this.states = stateThree;
        this.states = stateFour;
        this.states = stateFive;
    }

    ZoneAndState(String stateOne, String stateTwo, String stateThree, String stateFour,
                 String stateFive, String stateSix){

        this.states = stateOne;
        this.states = stateTwo;
        this.states = stateThree;
        this.states = stateFour;
        this.states = stateFive;
        this.states = stateSix;
    }

    ZoneAndState(String stateOne, String stateTwo, String stateThree, String stateFour,
                 String stateFive, String stateSix, String stateSeven){

        this.states = stateOne;
        this.states = stateTwo;
        this.states = stateThree;
        this.states = stateFour;
        this.states = stateFive;
        this.states = stateSix;
        this.states = stateSeven;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }
}
