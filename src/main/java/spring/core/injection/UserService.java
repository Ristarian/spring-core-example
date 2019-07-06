package spring.core.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserField userField;
    private final UserRepository userRepository;
    private UserSetter userSetter;
    private UserController userController;


    public UserService (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Autowired
    public void setUserSetter (UserSetter userSetter){
        this.userSetter = userSetter;
    }

    @Autowired
    public UserService(UserRepository userRepository, UserController userController){
        this.userRepository = userRepository;
        this.userController = userController;
    }

    public UserField getUserField() {
        return userField;
    }

    public UserSetter getUserSetter() {
        return userSetter;
    }

    public UserController getUserController() {
        return userController;
    }

}
