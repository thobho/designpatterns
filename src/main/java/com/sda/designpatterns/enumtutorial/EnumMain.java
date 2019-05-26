package com.sda.designpatterns.enumtutorial;

import java.util.Arrays;

public class EnumMain {
    public static void main(String[] args) {
//        System.out.println(DayOfWeek.FRIDAY.getDayDescription());

        DayOfWeek unknownDay = DayOfWeek.FRIDAY;

//        getAdditionalMessageForDay(unknownDay);

        System.out.println(DayOfWeek.valueOf("FRIDAY"));
        DayOfWeek[] values = DayOfWeek.values();

        Arrays.stream(values).forEach(System.out::println);

    }


    public static void getAdditionalMessageForDay(DayOfWeek dayOfWeek){
        switch (dayOfWeek){
            case FRIDAY:
                System.out.println("To jest piątek");
                break;
            case MONDAY:
                System.out.println("to jest opniedziałek");
            default:
                System.out.println("to jest inny dzień");
        }
    }

}
