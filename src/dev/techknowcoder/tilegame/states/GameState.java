package dev.techknowcoder.tilegame.states;

import java.awt.Graphics;


import dev.techknowcoder.tilegame.Handler;
import dev.techknowcoder.worlds.World;

public class GameState extends State {
//    Caused bug in this specific class

    private World world;

    public GameState(Handler handler){
        super(handler);
        world = new World(handler, "res/worlds/world1.txt");
        handler.setWorld(world);
    }

    @Override
    public void tick() {
        world.tick();
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
    }

}
