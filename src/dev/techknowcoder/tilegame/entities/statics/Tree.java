package dev.techknowcoder.tilegame.entities.statics;

import dev.techknowcoder.tilegame.Handler;
import dev.techknowcoder.tilegame.gfx.Assets;
import dev.techknowcoder.tiles.Tile;

import java.awt.*;

public class Tree extends StaticEntity {

    public Tree(Handler handler, float x, float y){
        super(handler, x, y, Tile.TILEWIDTH,Tile.TILEHEIGHT * 2);
    }

    @Override
    public void tick(){

    }

    @Override
    public void render(Graphics g){
        g.drawImage(Assets.tree,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
    }
}
