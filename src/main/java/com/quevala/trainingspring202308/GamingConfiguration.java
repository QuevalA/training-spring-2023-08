package com.quevala.trainingspring202308;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.quevala.trainingspring202308.game.GamingConsole;
import com.quevala.trainingspring202308.game.GameRunner;
import com.quevala.trainingspring202308.game.PacManGame;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new PacManGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
