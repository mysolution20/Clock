package com.kodilla.kodillaclock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.*;
import java.util.*;

class Clock<localTime> {
    private String clockName;
    private LocalTime localTime;
    public Clock(String clockName, int hour, int minute)
    {
        this.clockName = clockName;
        this.localTime = LocalTime.of( hour, minute);
    }

    public String getClockName() {
        return clockName;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }
}
@SpringBootApplication
public class KodillaClockApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaClockApplication.class, args);

        Clock[] clocks = {
                new Clock("Casioks", 16, 30),
                new Clock("Timeksio", 8, 20),
                new Clock("Seikos", 6, 44),
                new Clock("Budzik", 20, 1),
                new Clock("Rakietu", 13, 58),
                new Clock("Poilot", 17, 15),
                new Clock("Big Ben", 2, 01),
                new Clock("Zegarox", 3, 59),
                new Clock("Nauticara", 18, 00),
        };

        System. out.println("----loop.No.1----");
        List<Clock> clocksList = new LinkedList<>(Arrays.asList(clocks));
        for(Clock clock : clocksList)
            System. out.println( clock.getClockName()+": "+clock.getLocalTime().plusMinutes(1));

        System. out.println();
        System. out.println("----loop No.2----");
        for(int i = 0; i < clocksList.size();i++)
            System.out.println(clocksList.get(i).getClockName()+": "+clocksList.get(i).getLocalTime().plusMinutes(1));

    }

}
