package com.quevala.trainingspring202308.game;

public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Enter pipe");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Go forward");
    }
}
