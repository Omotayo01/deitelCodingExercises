package enumClass;

public enum University {

    UNILAG( "University of Lagos", "Lagos"),
    UNIPORT( "University of Port Harcourt",  "Rivers"),
    LASU( "Lagos state University");


    private String fullName;

    private String state;


    University(String fullName, String state){
        this.fullName = fullName;
        this.state = state;
        System.out.println(("I am creating " + fullName + " " + state));
    }

    University(String fullName){

        this.fullName = fullName;

    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

