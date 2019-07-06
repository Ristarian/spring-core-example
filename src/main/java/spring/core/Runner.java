package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) throws InterruptedException{

        // Tworzenie nowego kontekstu aplikacji na podstawie stworzonego pliku XML
        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("Beans.xml");

        // Pobieranie Beana ze stworzonego kontekstu
        xmlContext.getBean("playerSeller", PlayerSeller.class).sell();

        // Konfiguracja jawna i automatyczna
        ApplicationContext context = new AnnotationConfigApplicationContext(PlayerConfiguration.class);
        context.getBean("playerSeller", PlayerSeller.class).sell();
    }
}
