package spring.core;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("singletonBean")
public class LocalDateTimeSingleton {

    private final LocalDateTime localDateTime;

    public LocalDateTimeSingleton(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public void showLocalDateTime(){
        System.out.println(localDateTime);
    }
}
