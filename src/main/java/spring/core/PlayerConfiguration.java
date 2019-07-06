package spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayerConfiguration {

    @Bean
    Mp3Player mp3Player (){
        return new Mp3Player();
    }

    @Bean
    Mp4Player mp4Player (){
        return new Mp4Player();
    }

    @Bean
    Mp5Player mp5Player (){
        return new Mp5Player();
    }
}
