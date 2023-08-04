package com.quevala.trainingspring202308;

import com.quevala.trainingspring202308.game.GameRunner;
import com.quevala.trainingspring202308.game.MarioGame;
import com.quevala.trainingspring202308.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        var game = new MarioGame();
        //var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);

        gameRunner.run();
    }
}
