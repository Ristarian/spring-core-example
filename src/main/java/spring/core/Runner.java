package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {

        // Tworzenie nowego kontekstu aplikacji na podstawie stworzonego pliku XML
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        // Pobieranie Beana ze stworzonego kontekstu
        context.getBean("playerSeller", PlayerSeller.class).sell();


    }
}
