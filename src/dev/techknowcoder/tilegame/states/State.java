package dev.techknowcoder.tilegame.states;

import dev.techknowcoder.tilegame.Handler;

import java.awt.Graphics;

public abstract class State {

    private static State currentState = null;

    protected Handler handler;
    public State(Handler handler) {
        this.handler = handler;
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
