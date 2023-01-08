package tdd.chapterThree;

public class HeartRates {

    private String firstName;

    private String lastName;

    private String dateOfBirth;

    private int month;

    private int day;

    private int year;

    private int exactAge;

    private int maximumHeartRate;

    private String targetHeartRate;

    public HeartRates(String userFirstName, String userLastName, int userMonthOfBirth , int userDayOfBirth, int userYearOfBirth) {
        firstName = userFirstName;

        lastName = userLastName;

        month = userMonthOfBirth;

        day = userDayOfBirth;

        year = userYearOfBirth;
    }

public String getUserFirstName(){
    return firstName;
        }
    public String getUserLastName(){
        return lastName;
    }

    public int getUserBirthMonth() {
        return month;
    }

    public int getUserDayOfBirth() {
        return day;
    }

    public int getUserBirthYear() {
        return year;
    }

    public void setUserFirstName(String userFirstName){
        firstName = userFirstName;
    }

    public void setUserLastName(String userLastName){
        lastName = userLastName;
    }

    public void setUserMonthOfBirth(int userMonthOfBirth){
        month = userMonthOfBirth;
    }

    public void setUserYearOfBirth(int userYearOfBirth){
         year = userYearOfBirth;
    }

    public void setUserDayOfBirth(int userDayOfBirth){
        day = userDayOfBirth;
    }

    public String userDateOfBirth(){

        String userMonthOfBirth = "";
        String userYearOfBirth = "";
        String userDayOfBirth = "";
        if (month < 10) {
            userMonthOfBirth = "0" + String.valueOf(month);
        }
        else
            userMonthOfBirth = String.valueOf(month);

        if (day < 10) {
            userDayOfBirth = "0" + String.valueOf(day);
        }
        else
            userDayOfBirth = String.valueOf(day);

        userYearOfBirth = String.valueOf(year);

        dateOfBirth =  userMonthOfBirth + "/" + userDayOfBirth + "/" + userYearOfBirth;

        return dateOfBirth;
    }

    public int userAgeCalculatedInYears(){

    exactAge = 2022 - year;

        return exactAge;
    }

    public int userMaximumHeartRate(){

        maximumHeartRate = 220 - exactAge;

        return maximumHeartRate;

    }

public String userTargetHeartRate(){
      String fiftyPercentOfMaximumHeartRate = "";

    String eightyFivePercentOfMaximumHeartRate = "";

    fiftyPercentOfMaximumHeartRate = String.valueOf((50 * maximumHeartRate) / 100);

    eightyFivePercentOfMaximumHeartRate =  String.valueOf((85 * maximumHeartRate) / 100);

    targetHeartRate =  fiftyPercentOfMaximumHeartRate + " - " + eightyFivePercentOfMaximumHeartRate;

    return targetHeartRate;
    }

            }




