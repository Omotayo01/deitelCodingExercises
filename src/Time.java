public class Time {

    private int hour;

    private int minutes;

    private int second;


    public Time(int hour, int minutes, int second){
    validate(hour,minutes,second);

        this.hour = hour;
        this.minutes = minutes;
        this.second = second;


    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        validateMinutes(minutes);
        this.minutes = minutes;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSecond() {
        return second;
    }

    private static void validate(int hour , int minutes, int second){

        validateHour(hour);
        validateMinutes(minutes);
        validateSecond(second);
    }

    private static void validateSecond(int second) {
        boolean secondIsInvalid = second < 0 || second > 59;

        IllegalArgumentException toBeThrown = new IllegalArgumentException();

        if (secondIsInvalid)  throw toBeThrown;
    }

    private static void validateMinutes(int minutes) {
        boolean minutesIsInvalid = minutes < 0 || minutes > 59;
        if (minutesIsInvalid) throw new IllegalArgumentException("Minutes is invalid");
    }

    private static void validateHour(int hour){
        boolean hourIsInvalid = hour < 0 || hour > 23;
        if (hourIsInvalid) throw new IllegalArgumentException("Hour is invalid");
    }
}
