package dev.techknowcoder.tilegame.states;

import dev.techknowcoder.tilegame.Game;

import java.awt.Graphics;

public abstract class State {

    private static State currentState = null;

    public State(Game game) {

    }

    public static void setState(State state) {
        currentState = state;
    }

    public static State getState(){
        return currentState;
    }

//    CLASS
    public abstract void tick();

    public abstract void render(Graphics g);


}
