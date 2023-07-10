package app.model;

import org.springframework.context.annotation.Bean;


public class Timer {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }

    @Bean(name = "beanTimer")
    public Timer timer() {
        return new Timer();
    }
}
