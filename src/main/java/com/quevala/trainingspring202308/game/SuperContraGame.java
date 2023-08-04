package com.quevala.trainingspring202308.game;

public class SuperContraGame implements GamingConsole {

    public void up() {
        System.out.println("Climb");
    }

    public void down() {
        System.out.println("Crouch");
    }

    public void left() {
        System.out.println("Parry");
    }

    public void right() {
        System.out.println("Shoot");
    }
}
