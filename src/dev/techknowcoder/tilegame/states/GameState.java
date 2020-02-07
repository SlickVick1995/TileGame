package dev.techknowcoder.tilegame.states;

import java.awt.Graphics;

import dev.techknowcoder.tilegame.Game;
import dev.techknowcoder.tilegame.entities.creatures.Player;
import dev.techknowcoder.tiles.Tile;
import dev.techknowcoder.worlds.World;

public class GameState extends State {

    private Player player;
    private World world;
    public GameState(Game game){
        super(game);
        player = new Player( game, 100, 100);
        world = new World("");
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
