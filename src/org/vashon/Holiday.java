package org.vashon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Holiday {
    int month;
    int day;
    String name;
    String desc;
    boolean fedRec;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isFedRec() {
        return fedRec;
    }

    public void setFedRec(boolean fedRec) {
        this.fedRec = fedRec;
    }

    public Holiday(int month, int day, String name, String desc, boolean fedRec) {
        this.month = month;
        this.day = day;
        this.name = name;
        this.desc = desc;
        this.fedRec = fedRec;
    }
    public static boolean isToday(int month, int day){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");
        LocalDateTime today = LocalDateTime.now();
        String formated = today.format(formatter);
        if(formated.substring(0, 3).equals(String.valueOf(month)) && formated.substring(3, 6).equals(String.valueOf(day))) {
            return true;
        }
        return false;
    }
}
