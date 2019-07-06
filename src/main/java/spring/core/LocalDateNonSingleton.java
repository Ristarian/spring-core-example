package spring.core;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("prototypeBean")
@Scope("prototype")
public class LocalDateNonSingleton {

    private final LocalDateTime localDateTime;

    public LocalDateNonSingleton(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    void showLocalDateTime(){
        System.out.println(localDateTime);

    }
}
