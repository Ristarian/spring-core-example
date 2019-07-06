package spring.core.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    // wstrzykiwanie zależności poprzez pole
    @Autowired
    private UserField userField;
    private UserSetter userSetter;
    private final UserRepository userRepository;
    private UserController userController;

    // wstrzykiwanie zalęzności poprzez KONSTRUKTOR
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // wstrzyknięcie klasy UserRepository oraz UserController poprzez kolejny KONSTRUKTOR
    @Autowired
    public UserService(UserRepository userRepository, UserController userController) {
        this.userRepository = userRepository;
        this.userController = userController;
    }

    public UserField getUserField() {
        return userField;
    }

    public UserController getUserController(){
        return userController;
    }

    @Autowired
    public void setUserSetter (UserSetter userSetter){
        this.userSetter = userSetter;
    }

    public UserSetter getUserSetter(){
        return userSetter;
    }

}