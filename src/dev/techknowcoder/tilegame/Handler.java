package dev.techknowcoder.tilegame;

import dev.techknowcoder.tilegame.Game;
import dev.techknowcoder.tilegame.gfx.GameCamera;
import dev.techknowcoder.tilegame.input.KeyManager;
import dev.techknowcoder.tilegame.input.MouseManager;
import dev.techknowcoder.worlds.World;

public class Handler {

    private Game game;
    private World world;

    public Handler(Game game){
        this.game = game;
    }

    public int getWidth(){
        return game.getWidth();
    }

    public GameCamera getGameCamera(){
        return game.getGameCamera();
    }

    public KeyManager getKeyManager(){
        return game.getKeyManager();
    }

    public MouseManager getMouseManager(){
        return game.getMouseManager();
    }

    public int getHeight(){
        return game.getHeight();
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }
}
