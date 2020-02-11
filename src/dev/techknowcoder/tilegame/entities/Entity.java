package dev.techknowcoder.tilegame.entities;

import dev.techknowcoder.tilegame.Game;
import dev.techknowcoder.tilegame.Handler;

import java.awt.Graphics;
public abstract class Entity {

    protected Handler handler;
    protected float x, y;
    protected int width, height;

    public Entity(Handler handler, float x, float y, int width, int height){
        this.handler = handler;
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public abstract void tick();

    public abstract void render(Graphics g);
}
