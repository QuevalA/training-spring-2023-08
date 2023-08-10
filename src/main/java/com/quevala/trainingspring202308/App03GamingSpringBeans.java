package com.quevala.trainingspring202308;

import com.quevala.trainingspring202308.game.GameRunner;
import com.quevala.trainingspring202308.game.GamingConsole;
import com.quevala.trainingspring202308.game.PacManGame;
import com.quevala.trainingspring202308.helloworld.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingConfiguration.class))
        {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
