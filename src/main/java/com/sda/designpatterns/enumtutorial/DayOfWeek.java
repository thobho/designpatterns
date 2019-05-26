package com.sda.designpatterns.enumtutorial;

public enum DayOfWeek{
    MONDAY("Uff..", true),
    FRIDAY("JEEEE..", true),
    SATURDAY("!!!..", true),
    SUNDAY("Niedziela..", false);

    private String dayDescription;
    private boolean isWorkDay;

    DayOfWeek(String dayDescription, boolean isWorkDay) {
        this.dayDescription = dayDescription;
        this.isWorkDay = isWorkDay;
    }


    public String getDayDescription() {
        return dayDescription;
    }

    public void setDayDescription(String dayDescription) {
        this.dayDescription = dayDescription;
    }

    public boolean isWorkDay() {
        return isWorkDay;
    }

    public void setWorkDay(boolean workDay) {
        isWorkDay = workDay;
    }
}
