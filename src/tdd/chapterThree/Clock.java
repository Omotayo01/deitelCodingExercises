package tdd.chapterThree;

public class Clock {

    private int hour;

    private int minute;

    private int second;

    private String time;

    public Clock(int hour, int minute, int second) {

    }

    public int getCloCKHour() {
        return hour;
    }

    public int getClockMinutes() {
        return minute;
    }

    public int getClockSecond() {
        return second;
    }

    public void setClockHour(int clockHour){
        if (clockHour > 23)
            hour = 0;
        else
        hour = clockHour;
    }

    public void setClockMinute(int clockMinute){
        if (clockMinute > 59)
            minute = 0;
        else
        minute = clockMinute;

    }

    public void setClockSecond(int clockSecond){
        if (clockSecond > 59)
            second = 0;
        else
        second = clockSecond;
    }

    public String displayTime(){
        String timeHour = "";
        String timeMinutes = "";
        String timeSecond = "";
        if (hour < 10) {
            timeHour = "0" + String.valueOf(hour);
        }
        else
        timeHour = String.valueOf(hour);

        if (minute < 10) {
            timeMinutes = "0" + String.valueOf(minute);
        }
        else
        timeMinutes = String.valueOf(minute);

        if (second < 10) {
            timeSecond = "0" + String.valueOf(second);
        }
        else
        timeSecond = String.valueOf(second);

        time = timeHour + ":" + timeMinutes + ":" + timeSecond;
        return time;
    }
}