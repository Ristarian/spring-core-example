package spring.core.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    @Bean
    UserController userController(){
        return new UserController();
    }

    @Bean
    UserField userField(){
        return new UserField();
    }

    @Bean
    UserRepository userRepository(){
        return new UserRepository();
    }

    @Bean
    UserSetter userSetter(){
        return new UserSetter();
    }


}
