package io.zipcoder;

public class Problem6 {
    private Time time;

    public String convertToMilitaryTimeString(String input){
        this.time = new TimeSplitter(input).getTime();
        return new StringBuilder()
                .append(parseHours() + " ")
                .append(parseMinutes())
                .append("hours")
                .toString();
    }

    private String parseMinutes(){
        Integer minutes = time.getNumberOfMinutes();
        return (minutes != 0) ? NumberVerbalizer.toString(minutes) + " " :  "";
    }


    private String parseHours(){
        int value = time.getNumberOfHours();
        return NumberVerbalizer.toString(value) + " Hundred";
    }

}
