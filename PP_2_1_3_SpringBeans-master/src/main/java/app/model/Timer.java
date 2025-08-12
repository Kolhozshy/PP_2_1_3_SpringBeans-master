package app.model;

import org.springframework.stereotype.Component;

@Component("TimerBean")
public class Timer {

    private Long TimeMillis = System.currentTimeMillis();

    public Long getTime() {
        return TimeMillis;
    }
}
