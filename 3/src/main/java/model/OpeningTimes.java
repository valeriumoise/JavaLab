package model;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class OpeningTimes {
    private DayOfWeek dayOfWeek;
    private LocalTime from;
    private LocalTime to;

    public OpeningTimes(DayOfWeek dayOfWeek, LocalTime from, LocalTime to) {
        this.dayOfWeek = dayOfWeek;
        this.from = from;
        this.to = to;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalTime getFrom() {
        return from;
    }

    public void setFrom(LocalTime from) {
        this.from = from;
    }

    public LocalTime getTo() {
        return to;
    }

    public void setTo(LocalTime to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "{" +
                "dayOfWeek=" + dayOfWeek +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
