package dev.techknowcoder.tilegame.states;

import java.awt.Graphics;


import dev.techknowcoder.tilegame.Handler;
import dev.techknowcoder.tilegame.entities.creatures.Player;
import dev.techknowcoder.tiles.Tile;
import dev.techknowcoder.worlds.World;

public class GameState extends State {

    private Player player;
    private World world;
    public GameState(Handler handler){
        super(handler);
        player = new Player(handler, 100, 100);
        handler.setWorld(world);
        world = new World(handler, "res/worlds/world1.txt");
    }

    @Override
    public void tick() {
        world.tick();
        player.tick();
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        player.render(g);
        Tile.tiles[2].render(g, 0, 0);
    }
}
